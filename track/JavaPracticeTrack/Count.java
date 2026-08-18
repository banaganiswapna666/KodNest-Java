
class Freq {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}

class Count {

    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 20, 20, 20, 30};
        Freq f = new Freq();
        f.count(arr, 20);
    }
}
