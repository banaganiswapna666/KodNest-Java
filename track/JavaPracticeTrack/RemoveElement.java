
class RemoveElement {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = new int[a.length - 1];
        int index = 2;
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
