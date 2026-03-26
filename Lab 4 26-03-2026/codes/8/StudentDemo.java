import java.util.Scanner;

class Student {
    String name;
    int marks;
    static String collegeName = "ABC College";

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.input();
        s2.input();

        // Change static variable
        Student.collegeName = "XYZ University";
        System.out.println("");
        s1.display();
        System.out.println("");
        s2.display();
    }
}