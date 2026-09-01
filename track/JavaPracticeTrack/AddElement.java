
class AddElement {

    public static void main(String[] args) {
        int a[] = {10, 30, 5, 20};
        int b[] = new int[a.length + 1];
        int element = 50;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            b[b.length - 1] = element;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
