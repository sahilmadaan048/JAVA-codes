class Parent {

    Parent() {
        System.out.println("Parent Default Constructor");
    }

    Parent(int x) {
        System.out.println("Parent Parameterized Constructor: " + x);
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child Default Constructor");
    }

    Child(int x) {
        super(x);
        System.out.println("Child Parameterized Constructor: " + x);
    }
}

public class TestConstructorChaining {
    public static void main(String[] args) {

        Child obj1 = new Child();
        System.out.println();

        Child obj2 = new Child(10);
    }
}