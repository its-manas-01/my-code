import java.util.Scanner;
public class Inheritance {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        D ob=new D();
        System.out.println("Enter three values: ");
        ob.get1(sc.nextInt());
        ob.get2(sc.nextInt());
        ob.get3(sc.nextInt());
        ob.cal();
        sc.close();
    }
}
class A
{
    int a;
    public void get1(int x)
    {
        a=x;
    }
}
class B extends A
{
    int b;
    public void get2(int x)
    {
        b=x;
    }
}
class C extends B
{
    int c;
    public void get3(int x)
    {
        c=x;
    }
}

class D extends C
{
    int d;
    void cal()
    {
        d=(a>b)?(a>c?a:c):(b>c)?b:c;
        System.out.println("the maximun is :"+d);
    }
}