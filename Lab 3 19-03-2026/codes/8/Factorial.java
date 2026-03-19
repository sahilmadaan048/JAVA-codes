import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");

        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Please enter a valid non-negative integer !!");
            return;
        }

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}