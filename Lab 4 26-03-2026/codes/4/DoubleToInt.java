import java.util.Scanner;

public class DoubleToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        int i = (int) d;

        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);

        sc.close();
    }
}