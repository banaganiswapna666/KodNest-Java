
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "swapna";
        age = 19;
        height = 6.0;
    }

    public Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}

class ConstructorOverloding {

    public static void main(String[] args) {
        Student s2 = new Student();
        s2.display();
        Student s3 = new Student("Swapna");
        s3.display();
        Student s1 = new Student("Raja", 18, 6.0);
        s1.display();
    }
}
