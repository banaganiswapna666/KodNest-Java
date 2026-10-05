
class Demo1 {

    int a = 10;

    void disp1() {
        System.out.println(a);
    }
}

class Demo2 extends Demo1 {

    int y = 20;

    void disp2() {
        System.out.println(y);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.disp1();
        d2.disp2();
    }
}
