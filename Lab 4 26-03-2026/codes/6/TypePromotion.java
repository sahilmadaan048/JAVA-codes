public class TypePromotion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte is -128 to +127

        // this will get promoted to int on its own
        int result = a * b; 

        System.out.println("Result: " + result);
    }
}