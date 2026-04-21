class Parent {

    protected int value = 100;
}

class Child extends Parent {

    void display() {
        System.out.println("Value is: " + value);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}