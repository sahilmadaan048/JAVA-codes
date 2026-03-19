import java.util.Scanner;

public class InputUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            System.out.println("You entered: " + num);
        } while (num != 0);

        System.out.println("Program ended");
    }
}