import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
         int a,b=0,reminder,original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        original=a;
        while (a>0) {
            reminder =a%10;
            b=b+reminder*reminder*reminder;
            a=a/10;
        }
        if (b==original)
        {
            System.out.println(original+"is Armstrong Number");
        }            
        else
        {
            System.out.println(original+"is not an Armstrong Number");
        }
        sc.close();
    }
    }
