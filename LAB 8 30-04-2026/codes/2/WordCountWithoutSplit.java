import java.util.Scanner;

public class WordCountWithoutSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(i) != ' ') ||
                (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
    }
}