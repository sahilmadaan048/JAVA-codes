// ==========================================
// Program 5: Private Method Behavior
// ==========================================

class Parent {

    private void show() {
        System.out.println("Parent Private Method");
    }

    void display() {
        show();
    }
}

class Child extends Parent {

    // This is NOT overriding
    void show() {
        System.out.println("Child Method");
    }
}

public class PrivateMethodDemo {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.show();
    }
}