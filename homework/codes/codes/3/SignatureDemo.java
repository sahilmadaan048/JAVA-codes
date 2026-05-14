// ==========================================
// Program 3: Overriding Failure Example
// ==========================================

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    // Correct overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // This is NOT overriding
    // Different parameter list -> method overloading
    void sound(String type) {
        System.out.println("Dog sound type: " + type);
    }
}

public class SignatureDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sound("Loud");
    }
}