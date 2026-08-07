
import java.util.Scanner;

class Line {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Age is: " + age);

        System.out.println("Enter your height:");
        float height = scan.nextFloat();
        System.out.println("Height is: " + height);

        System.out.println("Enter your full name:");
        String fname = scan.nextLine();
        System.out.println("Full name is: " + fname);

    }
}
