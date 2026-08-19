
import java.util.Scanner;

public class MonthlySalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] a = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            int total = 0;

            for (int j = 0; j < columns; j++) {

                a[i][j] = scanner.nextInt();
                total = total + a[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }

        scanner.close();
    }
}
