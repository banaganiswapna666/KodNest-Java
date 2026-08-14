
import java.util.Scanner;

class Book {

    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class CreateBookDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        // Create Book object
        Book book = new Book(title, author);

        // Display book details
        book.display();

        scanner.close();
    }
}
