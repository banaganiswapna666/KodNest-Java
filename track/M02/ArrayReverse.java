
import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int size = sc.nextInt();

        // Read array elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target
        int target = sc.nextInt();

        // Search for target
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (target == arr[i]) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Print array in reverse order
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
