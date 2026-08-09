
import java.util.Scanner;

public class InteractiveLearner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int days = scanner.nextInt();

        int total = 0;

        for (int i = 0; i < days; i++) {
            total += scanner.nextInt();
        }

        double average = (double) total / days;

        String status;

        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
