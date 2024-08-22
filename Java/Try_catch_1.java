public class Try_catch_1
{
    public static void main(String[] args) {
        int a[]={5,10};
        int b=5;
        try
        {
            int x=a[2]/b-a[1];
        }
        catch(ArithmeticException c)
        {
            System.out.println("Divisionly zero");
        }
        catch(ArrayIndexOutOfBoundsException c)
        {
            System.out.println("Array index error");
        }
        catch(ArrayStoreException c)
        {
            System.out.println("Wrong data type");
        }
        int y=a[1]/a[0];
        System.out.println(y);
    }
}