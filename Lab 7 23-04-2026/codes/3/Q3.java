abstract class Person {

    Person() {
        System.out.println("Abstract class constructor called.");
    }

    abstract void display();
}

class Student extends Person {

    Student() {
        System.out.println("Subclass constructor called.");
    }

    void display() {
        System.out.println("Student details displayed.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}