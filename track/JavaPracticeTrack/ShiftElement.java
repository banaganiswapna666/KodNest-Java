
class ShiftElement {

    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        int temp;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
