
class StringMethods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.contains("KodNest"));
        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("Technologies"));
        System.out.println(str.contains(""));
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf('N'));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Technologies"));
        System.out.println(str.endsWith("Kod"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.replace('e', 'E'));
        System.out.println(str.replace('o', 'O'));
        System.out.println(str.replace("Technologies", "Technologies"));
        System.out.println(str.replace("Technologies", "Kodnest"));
        System.out.println(str.replaceFirst("Technologies", "Kodnest"));
        System.out.println(str.replaceAll("Technologies", "Kodnest"));
        System.out.println(str.replaceFirst("e", "E"));
        System.out.println(str.replaceAll("e", "E"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

    }
}
