
import java.util.Scanner;

class Product {

    String name;
    double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Display product details
    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

public class InitializeProductDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        // Create Product object
        Product product = new Product(name, price);

        // Display product details
        product.display();

        scanner.close();
    }
}
