import java.util.Scanner;

public class Calculator {
    public static int Addition(int a, int b) { return a+b; }
    public static int Subtraction(int a, int b) {
        return a-b;
    }
    public static int Multiplication(int a, int b) {
        return a*b;
    }
    public static int Division(int a, int b) {
        return a/b;
    }
    public static int Factorial(int a) {
        if (a ==0)
        {
            return 1;
        }
        else
        {
            return a*Factorial(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice,a,b,add,sub,multi,div,factorial;
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Factorial");
        System.out.println("Enter your choice:-");
        choice=in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter two value:-");
                a=in.nextInt();
                b=in.nextInt();
                add=Addition(a, b);
                System.out.println("The addition is :-"+add);
                break;
            case 2:
                System.out.println("Enter two value:-");
                a=in.nextInt();
                b=in.nextInt();
                sub=Subtraction(a, b);
                System.out.println("The subtraction is :-"+sub);
                break;
            case 3:
                System.out.println("Enter two value:-");
                a=in.nextInt();
                b=in.nextInt();
                multi=Multiplication(a, b);
                System.out.println("The multiplication is :-"+multi);
                break;
            case 4:
                System.out.println("Enter two value:-");
                a=in.nextInt();
                b=in.nextInt();
                div=Division(a, b);
                System.out.println("The division is :-"+div);
                break;
            case 5:
                System.out.println("Enter a value:-");
                a=in.nextInt();
                factorial=Factorial(a);
                System.out.println("The factorial is :-"+factorial);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        in.close();
    }
}
