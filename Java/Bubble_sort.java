import java.util.*;


public class Bubble_sort {
    public static int[] bubble(int[] elements)
    {
        for (int i = 0; i < elements.length-1; i++)
        {
            for(int j=0;j<elements.length-i-1;j++)
            {
                if(elements[j+1]<elements[j])
                {
                    int temp=elements[j+1];
                    elements[j+1]=elements[j];
                    elements[j]=temp;
                }
            }
        }
        // System.out.println(("The sorted elements are:-"));
        // for(int i = 0; i < elements.length; i++)
        // {
        //     System.out.print(elements[i]+"\t");
        // }
        return elements;
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] elements = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
        {
            elements[i] = sc.nextInt();
        }
        int[] a = bubble(elements);
        System.out.println(("The sorted elements are:-"));
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
        sc.close();
    }
}
