
class Parent {

    Parent() {
        System.out.println("Inside Parent 0 par constructor");
    }

    Parent(int a, int b) {
        System.out.println("Inside Parent 1 par constructor");
    }
}

class Child extends Parent {

    Child() {
        super(10, 20);
        System.out.println("Inside Child 0 par constructor");
    }

    Child(int b) {
        System.out.println("Inside child 1 par constructor");
    }
}

class ConstructorChaining {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
