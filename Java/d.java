// import java.util.*;
// import java.math.*;
// public class d {
//     public static void main(String[] args) {
//         Scanner scanner =new Scanner(System.in);
//         double n=scanner.nextDouble();
//         double b=scanner.nextDouble();
//         double a=Math.pow(n, b);
//         System.out.println(a);
//     }
// }
import java.util.*;




class d{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =new Scanner(System.in);
        String[] a=new String[3];
        for(int i=0;i<3;i++)
        {
            a[i]=scan.nextLine();
        }
        for(int i=0;i<a.length;i++)
        {
            int c=i+1;
            System.out.println(c+a[i]);
        }
        scan.close();
    }
}









