
import java.util.Scanner;

public class CascadingShift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // consume the leftover newline

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();
    }
}
