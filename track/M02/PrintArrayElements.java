
import java.util.Scanner;

public class PrintArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read array size
        int n = scanner.nextInt();

        // Create array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
