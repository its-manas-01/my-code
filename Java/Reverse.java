import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int a,b=0,reminder;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        while (a>0) {
            reminder =a%10;
            b=b*10+reminder;
            a=a/10;
        }
        System.out.println("The reverse is:-"+b);
        sc.close();
    }
}
