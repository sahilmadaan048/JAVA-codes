interface Animal {

    void sound();
    void sleep();

    default void eat() {
        System.out.println("Animal eats food.");
    }

    static void info() {
        System.out.println("Animals are living beings.");
    }
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks.");
    }

    public void sleep() {
        System.out.println("Dog sleeps.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
        d.eat();

        Animal.info();  // Static method call
    }
}