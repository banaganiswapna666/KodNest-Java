
import java.util.Scanner;

public class RepeatWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        System.out.print("Enter the repeat count: ");
        int repeatCount = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            builder.append(word);
        }

        System.out.println("Result: " + builder);

        scanner.close();
    }
}
