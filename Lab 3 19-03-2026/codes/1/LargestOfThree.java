import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();

        double largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest: " + largest);
    }
}