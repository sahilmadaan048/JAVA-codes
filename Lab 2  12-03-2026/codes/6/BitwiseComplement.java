import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int complement = (~a);

        System.out.println("Bitwise Complemenet of the number is: " + complement);
        
    }    
}
