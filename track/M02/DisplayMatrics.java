
import java.util.Scanner;

public class DisplayMatrics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] a = new int[rows][columns];

        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
