import java.util.Scanner;
public class class1 {
    public static void main(String[] args)
    {
        x ob=new x();
        ob.input();
        ob.display();
    }
}
class x
{
    int a,b,c,d;
    Scanner scanner=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the value of a,b,c");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
    }
    void display()
    {
        d=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The maximun is "+d);
    }
}