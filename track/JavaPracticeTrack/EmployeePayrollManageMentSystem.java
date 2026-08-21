
import java.util.Scanner;

class Employee {

    // Instance variables
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Zero-parameter constructor
    Employee() {
        employeeId = 0;
        employeeName = "";
        basicSalary = 0.0;
        bonus = 0.0;
    }

    // Parameterized constructor
    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Set employee details
    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Overloaded addBonus() - fixed bonus amount
    void addBonus(double bonusAmount) {
        this.bonus = this.bonus + bonusAmount;
    }

    // Overloaded addBonus() - percentage + extra reward
    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus
                = this.basicSalary * bonusPercentage / 100;

        double additionalBonus
                = percentageBonus + extraReward;

        this.bonus = this.bonus + additionalBonus;
    }

    // Calculate total salary
    double calculateTotalSalary() {
        double totalSalary = basicSalary + bonus;
        return totalSalary;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class EmployeePayrollManageMentSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read first employee details
        int employeeId1 = scanner.nextInt();
        scanner.nextLine();

        String employeeName1 = scanner.nextLine();

        double basicSalary1 = scanner.nextDouble();
        double bonus1 = scanner.nextDouble();

        // Create first employee
        Employee e1 = new Employee();

        e1.setEmployeeDetails(
                employeeId1,
                employeeName1,
                basicSalary1
        );

        // Add bonus to first employee
        e1.addBonus(bonus1);

        // Read second employee details
        int employeeId2 = scanner.nextInt();
        scanner.nextLine();

        String employeeName2 = scanner.nextLine();

        double basicSalary2 = scanner.nextDouble();
        double bonus2 = scanner.nextDouble();

        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        // Create second employee
        Employee e2 = new Employee(
                employeeId2,
                employeeName2,
                basicSalary2,
                bonus2
        );

        // Add percentage bonus and extra reward
        e2.addBonus(bonusPercentage, extraReward);

        // Display first employee
        System.out.println("Employee 1");
        e1.displayEmployee();

        System.out.println();

        // Display second employee
        System.out.println("Employee 2");
        e2.displayEmployee();

        scanner.close();
    }
}
