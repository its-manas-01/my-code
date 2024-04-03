import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        int a,b=0,reminder,original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:-");
        a=sc.nextInt();
        original=a;
        while (a>0) {
            reminder =a%10;
            b=b*10+reminder;
            a=a/10;
        }
        if (b==original) 
        {
            System.out.println("This number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
