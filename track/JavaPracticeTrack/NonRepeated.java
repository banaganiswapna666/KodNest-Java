
class NonRepeated {

    public static void main(String[] args) {
        String str = "serser";
        for (int i = 0; i <= str.length() - 1; i++) {
            boolean repeated = false;
            for (int j = 0; j <= str.length() - 1; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                }
            }
            if (!repeated) {
                System.out.println("Non Repeated Character: " + str.charAt(i));
                break;
            }
        }
    }
}
