
import java.util.Scanner;

class PrefixSubArraySum {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sin.nextInt();
        }
        long prefix[] = new long[arr.length];
        prefix[0] = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
