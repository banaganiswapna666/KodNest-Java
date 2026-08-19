
import java.util.Scanner;

public class CalculateTotalMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] a = new int[rows][columns];

        // Input the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print each row's total
        for (int i = 0; i < rows; i++) {

            int total = 0;

            for (int j = 0; j < columns; j++) {
                total = total + a[i][j];
            }

            System.out.println("Row " + (i + 1) + " total: " + total);
        }

        scanner.close();
    }
}
