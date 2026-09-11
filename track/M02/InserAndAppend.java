
import java.util.Scanner;

public class InserAndAppend {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();

        StringBuilder builder = new StringBuilder(baseText);

        // Insert prefix at the beginning
        builder.insert(0, prefix + " ");

        // Append suffix at the end
        builder.append(" " + suffix);

        System.out.println("Edited text: " + builder);

        scanner.close();
    }
}
