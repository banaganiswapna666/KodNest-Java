
class PerticularIndex {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = new int[a.length + 1];
        int index = 2;
        int element = 60;
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        b[index] = element;
        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
