// import java.util.*;

// public class Selection_sort {
//     public static int selection(int[] a,int n)
//     {
//         for (int i=0;i<n-1;i++)
//         {
//             int min=i;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[min]>a[j])
//                 {
//                     min=j;
//                 }
//             }
//             int temp=a[min];
//             a[min]=a[i];
//             a[i]=temp;
//         }
//         // System.out.println("The sorted elements are:-");
//         // for(int i=0;i<n;i++)
//         // {
//         //     System.out.print(a[i]+"\t");
//         // }
//         return a[n];
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.println("Enter the number of elements:-");
//         n = sc.nextInt();
//         int[] a=new int[n];
//         int[] b=new int[n];
//         System.out.println("Enter the elements:-");
//         for (int i=0; i<n; i++)
//         {
//             a[i] = sc.nextInt();
//         }
//         b[n] =selection(a, n);
//         System.out.println("The sorted elements are:-");
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(b[i]+"\t");
//         }
//         sc.close();
//     }
// }
import java.util.*;

public class Selection_sort {
    public static int[] selection(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements:-");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1]; // Corrected size of array b
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        b = selection(a, n); // Corrected assignment of sorted array to b
        System.out.println("The sorted elements are:-");
        for (int i = 0; i < n; i++) { // Corrected loop condition
            System.out.print(b[i] + "\t");
        }
        sc.close();
    }
}