import java.awt.*;
import java.applet.*;
public class B extends Applet
{
    TextField text1,text2;
    public void init()
    {
        text1=new TextField(8);
        text2=new TextField(8);
        add(text1);
        add(text2);
        text1.setText("0");
        text2.setText("0");
    }
    public void paint(Graphics g)
    {
        int x=0,y=0,z=0;
        String s1,s2,s;
        g.drawString("Enter two number:-", 10, 100);
        try
        {
            s1=text1.getText();
            s2=text2.getText();
            x=Integer.parseInt(s1);
            y=Integer.parseInt(s2);
        }
        catch(Exception e)
        {}
        z=x+y;
        s=String.valueOf(z);
        g.drawString("The sum is :-", 15, 150);
        g.drawString(s, 30, 500);
    }
}