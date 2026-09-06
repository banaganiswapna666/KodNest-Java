
import java.util.Scanner;

public class SeperateEvenOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = n - 1;

        // Move odd numbers to the left
        // and even numbers to the right
        for (int i = 0; i < n && i < j; i++) {

            if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j--;

            } else if (arr[j] % 2 == 0) {
                j--;
                i--;
            }
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
