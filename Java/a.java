import java.util.Scanner;
public class a {
    public static void main(String args[])
    {
       int a,b,temp;
       System.out.println("Enter two value:-");
       Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       temp=a;
       a=b;
       b=temp;
    }
}