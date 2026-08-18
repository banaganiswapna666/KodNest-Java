
class ArraySearch {

    void search(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index:" + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

class KeyElement {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}
