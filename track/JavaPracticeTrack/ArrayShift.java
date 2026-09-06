
class ArrayShift {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 60, 70, 80};
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = a[a.length - 1];
            a[a.length - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
