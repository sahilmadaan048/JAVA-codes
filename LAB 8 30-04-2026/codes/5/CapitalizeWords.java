import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                result += Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                result += ch;
            }

            if (ch == ' ') {
                capitalizeNext = true;
            }
        }

        System.out.println("Capitalized sentence: " + result);
    }
}