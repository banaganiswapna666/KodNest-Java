
public class CorrectScore {

    public static void main(String[] args) {

        int[] original = {14, 18, 22, 26};

        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // Create an independent snapshot
        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // Create an alias
        int[] liveView = original;

        // Update through liveView
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();

        System.out.println("Same object: " + (original == liveView));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.print("Requested value: " + original[requestedIndex]);
        } else {
            System.out.print("Requested value: Invalid index");
        }
    }
}
