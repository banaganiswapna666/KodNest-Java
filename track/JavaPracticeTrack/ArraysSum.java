
import java.util.*;

class ArraysSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println();
        System.out.println("Total: " + sum);
    }
}
