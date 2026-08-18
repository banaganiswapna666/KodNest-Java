
public class ArrayMutationTracker {

    public static void main(String[] args) {

        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // Create snapshot
        int[] snapshot = new int[readings.length];

        // Copy readings into snapshot
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // Update the original array
        readings[updateIndex] = newValue;

        // Print snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();

        // Print updated readings
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}
