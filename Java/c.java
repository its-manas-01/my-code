import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**Sum of 2d arrays**");
        System.out.println("Enter the size of array:-");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array1 = new int[m][n];
        System.out.println("Enter the value of 1st array:-");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the value of 2nd array:-");
        int[][] array2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The answer is :-");
        int[][] array3 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array3[i][j] = array1[i][j]+array2[i][j];
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
