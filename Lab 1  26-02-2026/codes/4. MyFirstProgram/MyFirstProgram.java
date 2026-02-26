import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Roll Number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter your Department: ");
        String department = sc.nextLine();

        System.out.print("Enter your Email: ");
        String email = sc.nextLine();

        // Printing formatted output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);

        sc.close();
    }
}