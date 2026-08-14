
import java.util.Scanner;

class Employee {

    String name;
    String role;

    Employee() {
        role = "Trainee";
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class EmployeeRole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Employee e = new Employee();
        e.name = name;

        e.display();

        scanner.close();
    }
}
