
class Employee {

    int id;
    String name;
    String email;
    int salary;

    Employee(int id, String name, String email, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("salary: " + salary);
    }
}

class EmployeeApplications {

    public static void main(String[] args) {
        Employee e = new Employee(123, "swapna", "swapna@gmail.com", 20000);
        e.display();
    }
}
