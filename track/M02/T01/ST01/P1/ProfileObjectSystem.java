
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;

    void display() {
        System.out.println(id + " - " + name + " - " + javaScore);
    }
}

public class ProfileObjectSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Learner 1
        Learner l1 = new Learner();

        l1.id = scanner.nextInt();
        scanner.nextLine();
        l1.name = scanner.nextLine();
        l1.javaScore = scanner.nextInt();

        // Learner 2
        Learner l2 = new Learner();

        l2.id = scanner.nextInt();
        scanner.nextLine();
        l2.name = scanner.nextLine();
        l2.javaScore = scanner.nextInt();

        // New score for learner 1
        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        l1.display();
        l2.display();

        // Update learner 1's Java score
        l1.javaScore = newScore;

        System.out.println("After Update");
        l1.display();
        l2.display();

        scanner.close();
    }
}
