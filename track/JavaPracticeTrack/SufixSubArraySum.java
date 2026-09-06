
import java.util.Scanner;

class SufixSubArraySum {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sin.nextInt();
        }
        long sufix[] = new long[arr.length];
        sufix[n - 1] = arr[n - 1];
        int sum = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum = sum + arr[i];
            sufix[i] = sum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sufix[i] + " ");
        }
    }
}
