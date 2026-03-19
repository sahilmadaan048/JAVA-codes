import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();   

        String rev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            rev += num.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}