import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int value = ch; // implicit conversion from character to int (chote se bada)

        System.out.println("Character: " + ch);
        System.out.println("Integer value: " + value);

        sc.close();
    }
}