
import java.util.Scanner;

public class StringAppend {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        // Append the labels and values
        builder.append("Learner: " + learnerName);
        builder.append(" | ");
        builder.append("Course: " + courseName);

        System.out.println(builder);

        scanner.close();
    }
}
