
import java.util.Scanner;

class InteractiveLearnerProfile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        System.out.println("Learner: " + firstName);
        int problemsSolved = scan.nextInt();
        System.out.println("Problems Solved: " + problemsSolved);
        double assessmentPercentage = scan.nextDouble();
        System.out.println("Assessment: " + assessmentPercentage);
    }
}
