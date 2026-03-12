import java.util.Scanner;

public class SquareRootProgram {

    static int squareRoot(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // changed to int

        System.out.println("Square root using predefined method = " + Math.sqrt(num));
        System.out.println("Square root using user-defined method = " + squareRoot(num));
    }
}