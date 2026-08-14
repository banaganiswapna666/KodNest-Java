
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeProfileInitialization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        scanner.nextLine();

        String name = scanner.nextLine();
        String department = scanner.nextLine();

        Employee e = new Employee(id, name, department);
        e.display();

        scanner.close();
    }
}
