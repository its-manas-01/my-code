import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class BrenshemLineDrawing extends JPanel{

    private int x1,y1,y2,x2;

    public BrenshemLineDrawing(int x1, int y1, int x2, int y2) 
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;

        int dx=x2-x1;
        int dy=y1-y2;
        int p=(2*dy)-dx;
        while(x1!=x2 && y1!=y2)
        {
            if(p<0)
            {
                
                x1 = x1+1;
                // y1 = y1;
                p=p+(2*dy);
                g2d.drawRect(x1, y1, 1, 1);
            }
            else
            {
               
                x1 = x1+1;
                y1 = y1+1;
                p=p+(2*dy)-(2*dx);
                g2d.drawRect(x1, y1, 1, 1);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        JFrame frame=new JFrame("Brenshem Line Drawing:-");

        System.out.println("Enter the starting point");
        int x1=sc.nextInt(),y1=sc.nextInt();

        System.out.println("Enter the ending point");
        int x2=sc.nextInt(),y2=sc.nextInt();

        // int x1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting X coordinate:"));
        // int y1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting Y coordinate:"));
        // int x2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the ending X coordinate:"));
        // int y2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the ending Y coordinate:"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(new BrenshemLineDrawing(x1,y1,x2,y2));
        frame.setVisible(true);
        sc.close();
    }
}
