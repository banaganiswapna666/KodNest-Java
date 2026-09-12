import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Reverse the word
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        String reversed = sb.toString();

        // Compare original and reversed word
        boolean result;

        if (word.equalsIgnoreCase(reversed)) {
            result = true;
        } else {
            result = false;
        }

        // Display output
        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome: " + result);

        scanner.close();
    }
}