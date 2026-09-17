
class Demo {

    static int count = 0;

    Demo() {
        count++;
    }
}

public class CountObjects {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println("Number of Objects:" + Demo.count);
    }
}
