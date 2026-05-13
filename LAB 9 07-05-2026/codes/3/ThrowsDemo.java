import java.io.*;

public class ThrowsDemo {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        br.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or error reading file");
        }
    }
}