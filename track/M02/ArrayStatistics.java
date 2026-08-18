
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] integer = new int[size];

        // Read array elements
        for (int i = 0; i < integer.length; i++) {
            integer[i] = scan.nextInt();
        }

        int minimum = integer[0];
        int maximum = integer[0];

        // Find minimum and maximum
        for (int i = 1; i < integer.length; i++) {

            if (integer[i] < minimum) {
                minimum = integer[i];
            }

            if (integer[i] > maximum) {
                maximum = integer[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        scan.close();
    }
}
