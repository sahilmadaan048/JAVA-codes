public class CountCharacters {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a sentence as command-line input.");
            return;
        }

        String sentence = String.join(" ", args);

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total characters (excluding spaces): " + count);
    }
}