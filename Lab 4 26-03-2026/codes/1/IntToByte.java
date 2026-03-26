import java.util.Scanner;

public class IntToByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        byte b = (byte) num; // explicit casting

        System.out.println("Integer value: " + num);
        System.out.println("Converted byte value: " + b);

        sc.close();
    }
}