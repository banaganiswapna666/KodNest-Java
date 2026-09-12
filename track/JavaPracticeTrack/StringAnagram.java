
import java.util.Arrays;
import java.util.Scanner;

class StringAnagram {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the strings:");
        String s1 = sin.next();
        String s2 = sin.next();
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);
        if (sortedStr1.equals(sortedStr2)) {
            System.out.println("given strings are anagram");
        } else {
            System.out.println("given strings are not anagram");
        }
    }
}
