// import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice,a,b,add,sub,multi,div;
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter your choice:-");
        choice=in.nextInt();
        System.out.println("Enter two value:-");
        // a=Integer.parseInt(bnf.readline());
        a=in.nextInt();
        b=in.nextInt();
        switch (choice) {
            case 1:
                add=a+b;
                System.out.println(add);
                break;
            case 2:
                sub=a-b;
                System.out.println(sub);
                break;
            case 3:
                multi=a*b;
                System.out.println(multi);
                break;
            case 4:
                div=a/b;
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
