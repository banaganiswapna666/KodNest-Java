
import java.util.Scanner;

class JackedArray {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int a[][] = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];
        System.out.println("Enter array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sin.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
