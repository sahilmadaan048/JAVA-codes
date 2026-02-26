import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        System.out.println("Bitwise AND (&)  : " + (num1 & num2));
        System.out.println("Bitwise OR (|)   : " + (num1 | num2));
        System.out.println("Bitwise XOR (^)  : " + (num1 ^ num2));
        System.out.println("Complement of num1 (~): " + (~num1));
        System.out.println("Complement of num2 (~): " + (~num2));

        sc.close();
    }
}