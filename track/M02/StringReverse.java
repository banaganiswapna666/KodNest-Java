
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder sbr = new StringBuilder(text);

        sbr.reverse();

        System.out.println("Reversed: " + sbr);
    }
}
