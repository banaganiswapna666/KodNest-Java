
import java.util.Scanner;

public class FirstMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the target
        int target = scanner.nextInt();

        int index = -1;

        // Find the first matching index
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // Display the result
        System.out.println("First index: " + index);

        scanner.close();
    }
}
