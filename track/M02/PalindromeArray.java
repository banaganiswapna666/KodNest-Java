
import java.util.Scanner;

public class PalindromeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int palindrome = 1;

        while (left < right) {
            if (numbers[left] != numbers[right]) {
                palindrome = 0;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);

        scanner.close();
    }
}
