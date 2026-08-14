
import java.util.Scanner;

class Student {

    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class InitializeStudentName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Create Student object
        Student student = new Student(name);

        // Display student details
        student.display();

        scanner.close();
    }
}
