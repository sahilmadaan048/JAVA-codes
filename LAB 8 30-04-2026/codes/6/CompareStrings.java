public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
        System.out.println("str2.compareTo(str3): " + str2.compareTo(str3));
    }
}