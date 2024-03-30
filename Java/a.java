import java.util.Scanner;
public class a {
    public static void main(String args[])
    {
       int a,b,temp;
       System.out.println("Enter two value:-");
       Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       System.out.println("Before swapping a="+a +" and b=" +b);
       temp=a;
       a=b;
       b=temp;
       System.out.println("After swapping a=" +a+" and b=" +b);
       sc.close();
    }
}