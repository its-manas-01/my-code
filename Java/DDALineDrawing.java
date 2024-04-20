// import java.util.*;
// public class DDAAlgo 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         float x0,xn,y0,yn;
//         int a,b,m,steps;
//         System.out.println("Enter starting point: ");
//         x0=sc.nextFloat();
//         y0=sc.nextFloat();
//         System.out.println("Enter ending point: ");
//         xn=sc.nextFloat();
//         yn=sc.nextFloat();
//         a=(int)(xn-x0);
//         b=(int)(yn-y0);
//         m=b/a;
//         if (a>b) 
//         {
//             steps=a;   
//         }
//         else
//         {
//             steps=b;
//         }
//         for (int i=0; i<steps; i++) 
//         {
//             if(m<1)
//             {

//             }
//             else if(m==1)
//             {

//             }
//             else
//             {
//                 x0=((1/m)+x0);
//                 y0=(1+y0);
//             }    
    
//         }   
//         sc.close(); 
//     }
// }
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class DDALineDrawing extends JPanel {
    
    private int x1, y1, x2, y2;

    public DDALineDrawing(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int dx = x2 - x1;
        int dy = y2 - y1;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            g2d.drawRect(Math.round(x), Math.round(y), 1, 1);
            x += xIncrement;
            y += yIncrement;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point:");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.println("Enter the ending point:");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        JFrame frame = new JFrame("DDA Line Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new DDALineDrawing(x1, y1, x2, y2));
        frame.setVisible(true);
        sc.close();
    }
}
