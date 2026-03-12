import java.util.*;
import java.util.Scanner;

public class AreaAndParameter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of Rectangle: ");
        int b = sc.nextInt();

        int perimeter = 2 * (l + b);
        int area = (l+b);

        System.out.println("");

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }   
}
