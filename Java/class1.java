import java.util.Scanner;
public class class1 {
    public static void main(String[] args)
    {
        A ob=new A();
        ob.input();
        ob.display();
    }
}
class A
{
    int a,b,c,d;
    Scanner scanner=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter the value of a,b,c");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
    }
    public void display()
    {
        d=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The maximun is "+d);
    }
}