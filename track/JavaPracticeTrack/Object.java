
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

class Object {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("swapna", 21, 5.0);
        s1.display();
    }
}
