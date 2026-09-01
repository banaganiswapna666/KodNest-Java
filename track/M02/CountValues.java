
import java.util.Scanner;

public class CountValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        long sum = 0;

        // Read array elements and calculate sum
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        int count = 0;

        // Count elements greater than average
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
