
import java.util.Scanner;

public class ReverseSelectedRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int first = scanner.nextInt();
        int last = scanner.nextInt();

        if (first < 0 || last >= n || first > last) {
            System.out.println(-1);
        } else {
            while (first < last) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;

                first++;
                last--;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
