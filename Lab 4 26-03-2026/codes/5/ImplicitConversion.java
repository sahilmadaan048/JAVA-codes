import java.util.Scanner;

public class ImplicitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a double: ");
        double b = sc.nextDouble();

        double result = a + b; // int automatically converted to double

        System.out.println("Result: " + result);

        sc.close();
    }
}