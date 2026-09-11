
import java.util.*;

class StringPalindrome {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sin.nextLine();
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i = 0; i <= charArr.length - 1; i++) {
            revArr[j] = charArr[i];
            j--;
        }
        String revStr = new String(revArr);
        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("the given String is Palindrome");
        } else {
            System.out.println("the given String is not a Palindrome");
        }
    }
}
