package DSA.Searching;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A ob=new A();
        System.out.println("Enter the quentity of elements:-");
        ob.n=scanner.nextInt();
        for (int i=0;i<ob.n;i++)
        {
            ob.get(scanner.nextInt());
        }
        System.out.println("Enter the element you find:-");
        ob.key=scanner.nextInt();
        int i=ob.cal();
        System.out.println("The element is exists in "+i+"position");
        scanner.close();
    }
}

class A{
    int n;
    int[] a=new int[n];
    void get(int x)
    {
        int i=0;
        a[i]=x;
        i++;
    }
    int key;
    int cal()
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                System.out.println(key+"is found");
                break;
            }
        }
        return i;
    }
}