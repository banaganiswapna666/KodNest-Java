
import java.util.Scanner;

class WaterTank {

    int capacity;
    int currentLevel;

    // Constructor
    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    // Fill water
    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        int availableSpace = capacity - currentLevel;
        int actualAdded;

        if (amount <= availableSpace) {
            actualAdded = amount;
        } else {
            actualAdded = availableSpace;
        }

        currentLevel += actualAdded;
        return actualAdded;
    }

    // Drain water
    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        int actualRemoved;

        if (amount <= currentLevel) {
            actualRemoved = amount;
        } else {
            actualRemoved = currentLevel;
        }

        currentLevel -= actualRemoved;
        return actualRemoved;
    }

    // Get tank status
    String getStatus() {
        double fillPercentage = currentLevel * 100.0 / capacity;

        if (currentLevel == 0) {
            return "Empty";
        } else if (fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage <= 75) {
            return "Medium";
        } else if (fillPercentage < 100) {
            return "High";
        } else {
            return "Full";
        }
    }

    // Display tank
    void displayTank() {
        int availableSpace = capacity - currentLevel;

        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }
}

public class WaterTankManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read capacity, initial level and number of operations
        int capacity = scanner.nextInt();
        int initialLevel = scanner.nextInt();
        int numberOfOperations = scanner.nextInt();

        // Create WaterTank object
        WaterTank tank = new WaterTank(capacity, initialLevel);

        // Process operations
        for (int i = 1; i <= numberOfOperations; i++) {

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Fill water
                    int fillAmount = scanner.nextInt();
                    int filled = tank.fillWater(fillAmount);

                    System.out.println(
                            "Operation " + i + " - Filled: " + filled
                    );
                    break;

                case 2:
                    // Drain water
                    int drainAmount = scanner.nextInt();
                    int drained = tank.drainWater(drainAmount);

                    System.out.println(
                            "Operation " + i + " - Drained: " + drained
                    );
                    break;

                case 3:
                    // Display tank status
                    System.out.println(
                            "Operation " + i + " - Tank Status"
                    );
                    tank.displayTank();
                    break;

                default:
                    // Invalid choice
                    System.out.println(
                            "Operation " + i + " - Invalid Choice"
                    );
            }
        }

        // Final tank status
        System.out.println("Final Tank Status");
        tank.displayTank();

        scanner.close();
    }
}
