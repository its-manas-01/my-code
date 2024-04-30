import java.util.*;
public class polymorphism
{
    public static void main(String[] args)
    {
        A ob= new A();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        ob.input(scanner.nextInt());
        ob.input(scanner.nextInt(),scanner.nextInt());
        ob.display();
        scanner.close();
    }
}
class A
{
    int a,b,c,d;
    public void input(int x)
    {
        a=x;
    }
    public void input(int x,int y)
    {
        b=x;
        c=y;
    }
    public void display()
    {
        d=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("the maximum is "+this.d);
    }
}