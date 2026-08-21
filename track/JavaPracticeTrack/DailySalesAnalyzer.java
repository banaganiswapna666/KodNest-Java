
import java.util.Scanner;

class SalesAnalyzer {

    // Declare the dailySales array
    double[] dailySales;

    // Constructor
    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    // Calculate total sales
    double calculateTotal() {
        double total = 0.0;

        for (int i = 0; i < dailySales.length; i++) {
            total = total + dailySales[i];
        }

        return total;
    }

    // Calculate average sales
    double calculateAverage() {
        double total = calculateTotal();
        double average = total / dailySales.length;

        return average;
    }

    // Find the day with highest sales
    int findHighestSalesDay() {
        int highestIndex = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > dailySales[highestIndex]) {
                highestIndex = i;
            }
        }

        return highestIndex + 1;
    }

    // Find the day with lowest sales
    int findLowestSalesDay() {
        int lowestIndex = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < dailySales[lowestIndex]) {
                lowestIndex = i;
            }
        }

        return lowestIndex + 1;
    }

    // Count days above average
    int countAboveAverageDays() {
        double average = calculateAverage();
        int count = 0;

        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }

        return count;
    }

    // Display sales report
    void displayReport() {
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();

        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + dailySales[highestDay - 1]);
        System.out.println("Lowest Sales Day: " + lowestDay);
        System.out.println("Lowest Sales: " + dailySales[lowestDay - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}

public class DailySalesAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number of days
        int numberOfDays = scanner.nextInt();

        // Create and populate sales array
        double[] dailySales = new double[numberOfDays];

        for (int i = 0; i < dailySales.length; i++) {
            dailySales[i] = scanner.nextDouble();
        }

        // Create SalesAnalyzer object
        SalesAnalyzer analyzer = new SalesAnalyzer(dailySales);

        // Display the report
        analyzer.displayReport();

        scanner.close();
    }
}
