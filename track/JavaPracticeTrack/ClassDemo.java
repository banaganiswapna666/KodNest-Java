
class Demo {

    static {
        System.out.println("1st static-Block executed");
    }

    static {
        System.out.println("2nd static-Block executed");
    }

    static {
        System.out.println("3rd static-Block executed");
    }

    {
        System.out.println("1st non-static-Block executed");
    }

    {
        System.out.println("2nd non-static-Block executed");
    }

    {
        System.out.println("3rd non-static-Block executed");
    }
}

public class ClassDemo {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}
