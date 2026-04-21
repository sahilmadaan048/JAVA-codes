class Parent {

    private int privateVar = 100;
    public int publicVar = 200;

    public void show() {
        System.out.println("Parent privateVar: " + privateVar);
    }
}

class Child extends Parent {

    public void display() {
        System.out.println("Inherited publicVar: " + publicVar);
    }
}

public class TestPrivateInheritance {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}