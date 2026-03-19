import java.util.Scanner;

public class MultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer number: ");

        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println("Multiple of 10");
        } else {
            System.out.println("Not a multiple of 10");
        }
    }
}