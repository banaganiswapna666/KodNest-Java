
import java.util.*;

class StringReverse {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sin.nextLine();
        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];
        int j = newArr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[j] = arr[i];
            j--;
        }
        String revStr = new String(newArr);
        System.out.println("original Strig is: " + str);
        System.out.println("reversed Strig is: " + revStr);
    }
}
