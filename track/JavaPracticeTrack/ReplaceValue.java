
import java.util.Scanner;

public class ReplaceValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target and replacement values
        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        int count = 0;

        // Replace matching values
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                numbers[i] = replacement;
                count++;
            }
        }

        // Display output
        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
