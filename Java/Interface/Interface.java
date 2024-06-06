import java.util.Scanner;

interface  x{
    static final int a=5;
    void cal(int b);   
}
class m implements x{
    int c,d;
    public void cal(int b)
    {
        c=b;
    }
    void calculate()
    {
        d=(a+c);
        System.out.println(d);
    }
}
public class Interface {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c=scanner.nextInt();
        m ob =new m();
        ob.cal(c);
        ob.calculate();
        scanner.close();
    }
}
