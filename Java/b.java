// import java.util.Scanner;

// public class b {

//     public static void main(String[] args)
//     {
//         int m,n;
//         Scanner sc=new Scanner(System.in);
//         m=sc.nextInt();
//         n=sc.nextInt();
//         for (int i=0;i<=m;i++)
//         {
//             for (int j=0;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if(i==1||j==1||j==n||i==m)
                    System.out.print("*");
                else
                    System.out.print(" ");  
            }
            System.out.println();
        }        
    }
}
