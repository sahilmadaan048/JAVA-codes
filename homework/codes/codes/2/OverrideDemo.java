// ==========================================
// Program 2: Method Overriding
// ==========================================

class Person {

    void displayDetails() {
        System.out.println("Person Details");
    }
}

class Student extends Person {

    @Override
    void displayDetails() {
        System.out.println("Student Details");
    }
}

class Teacher extends Person {

    @Override
    void displayDetails() {
        System.out.println("Teacher Details");
    }
}

public class OverrideDemo {

    public static void main(String[] args) {

        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.displayDetails();
        p2.displayDetails();
    }
}