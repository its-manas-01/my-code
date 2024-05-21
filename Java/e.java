// public class e {
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         int c=a+b;
//         System.out.println(c);
//     }
// }
public class e {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("value before swap are:-"+a+"&"+b);
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("value after swap are:-"+a+"&"+b);
    }
}
