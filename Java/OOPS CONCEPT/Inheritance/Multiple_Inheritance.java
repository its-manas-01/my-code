import java.util.Scanner;
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        y ob=new y();
        ob.get(a);
        ob.get(b,c);
        ob.cal();
        System.out.println(ob.d+"is the maximum");
        sc.close();
    }
}
interface z {
    void get(int x);
    void get(int x, int y);
}
class x
{
    int a,b,c;
}
class y extends x implements z{
    int d;
    public void get(int x)
    {
        a=x;
    }
    public void get(int x, int y)
    {
        b=x;
        c=y;
    }
    int cal()
    {
        d=a>b?a>c?a:c:b>c?b:c;
        return d;
    }
}