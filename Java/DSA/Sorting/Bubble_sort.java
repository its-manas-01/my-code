package DSA.Sorting;
public class Bubble_sort{
    public static void main(String[] args) {
        int n;
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quentity of number :-");
        n=Integer.parseInt(args[0]);
        int[] a=new int[n];
        for (int i=0; i<a.length; i++) {
            a[i]=Integer.parseInt(args[i+1]);
        }
        for (int i=0;i<a.length-1;i++) {
            for(int j=1;j<a.length-i-1;j++)
            {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is :-");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        // sc.close();
    }
}