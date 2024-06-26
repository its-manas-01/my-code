import java.util.Scanner;

import Pkg.*;

public class Linear_search 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        A ob=new A();
        System.out.println("Enter the quentity of number:-");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number:-");
        for(int i=0;i<5;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the number to search:-");
        int key=scanner.nextInt();
        int x=ob.Linear_search(arr, key);
        System.out.println(x);
        scanner.close();
    }
}
