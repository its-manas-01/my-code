import java.util.Scanner;
public class string_reverse {
    public static void reverse(String str, int index) 
    {
        if(index>=0)
        {
            System.out.println(str.charAt(index));
            reverse(str, index-1);
        }
    }
    public static void main(String[] args) 
    {
        String str = new String();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        reverse(str, str.length()-1);
        sc.close();
    }
}
