
import java.util.Scanner;

class ScannerClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int value:");
        int a = scan.nextInt();
        System.out.println("Integer value is: " + a);

        System.out.println("Enter byte value:");
        byte b = scan.nextByte();
        System.out.println("byte value is: " + b);

        System.out.println("Enter short value:");
        short c = scan.nextShort();
        System.out.println("short value is: " + c);

        System.out.println("Enter float value:");
        float d = scan.nextFloat();
        System.out.println("float value is: " + d);

        System.out.println("Enter double value:");
        double e = scan.nextDouble();
        System.out.println("double value is: " + e);

        System.out.println("Enter boolean value:");
        boolean f = scan.nextBoolean();
        System.out.println("boolean value is: " + f);

        System.out.println("Enter long value:");
        long g = scan.nextLong();
        System.out.println("long value is: " + g);
    }
}
