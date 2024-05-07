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
            System.out.println(c+" "+a[i]);
        }
        scan.close();
    }
}









