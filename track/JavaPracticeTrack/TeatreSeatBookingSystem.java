
import java.util.Scanner;

class TheatreBooking {

    int[] seats;
    int bookedCount;

    // Constructor
    TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    // Book a seat
    String bookSeats(int seatNumber) {

        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }

        int seatIndex = seatNumber - 1;

        if (seats[seatIndex] == 1) {
            return "Already Booked";
        }

        seats[seatIndex] = 1;
        bookedCount++;

        return "Booked";
    }

    // Get available seat count
    int getAvailableCount() {
        return seats.length - bookedCount;
    }

    // Display all seat statuses
    void displaySeatStatus() {

        System.out.println("Seat Status");

        for (int i = 0; i < seats.length; i++) {

            String status;

            if (seats[i] == 1) {
                status = "Booked";
            } else {
                status = "Available";
            }

            System.out.println("Seat " + (i + 1) + ": " + status);
        }
    }
}

public class TeatreSeatBookingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read total seats and number of booking requests
        int totalSeats = scanner.nextInt();
        int requestCount = scanner.nextInt();

        TheatreBooking theatre
                = new TheatreBooking(totalSeats);

        // Process booking requests
        for (int i = 1; i <= requestCount; i++) {

            int seatNumber = scanner.nextInt();

            String result = theatre.bookSeats(seatNumber);

            System.out.println(
                    "Request " + i + " - Seat "
                    + seatNumber + ": " + result
            );
        }

        // Display final seat status
        theatre.displaySeatStatus();

        // Display counts
        System.out.println("Booked Seats: " + theatre.bookedCount);
        System.out.println(
                "Available Seats: "
                + theatre.getAvailableCount()
        );

        scanner.close();
    }
}
