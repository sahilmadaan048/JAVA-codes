public class FullyQualifiedDemo {
    public static void main(String[] args) {

        // Using fully qualified name
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("You entered: " + num);
    }
}