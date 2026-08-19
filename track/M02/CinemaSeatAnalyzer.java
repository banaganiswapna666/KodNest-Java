
import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] a = new int[rows][columns];

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                a[i][j] = scanner.nextInt();

                if (a[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);

        scanner.close();
    }
}
