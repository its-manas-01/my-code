import java.io.*;
public class Combination {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n:-");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of r:-");
        int r=Integer.parseInt(br.readLine());
        int x=n-r,f1=1,f2=1,f3=1;
        while(n!=0)
        {
            f1=f1*n;
            n--;
        }
        while(r!=0)
        {
            f2=f2*r;
            r--;
        }
        while(x!=0)
        {
            f3=f3*x;
            x--;
        }
        System.out.println(f1/(f2*f3));
    }
}
