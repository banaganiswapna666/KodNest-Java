
class Program2 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JaVa";
        if (s1 == s2) {
            System.out.println("Ref are equals");
        } else {
            System.out.println("Ref are not equals");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
