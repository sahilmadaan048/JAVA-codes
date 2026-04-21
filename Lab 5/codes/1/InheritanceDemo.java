// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// ------------------ SINGLE INHERITANCE ------------------
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// ------------------ MULTILEVEL INHERITANCE ------------------
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// ------------------ HIERARCHICAL INHERITANCE ------------------
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog

        System.out.println();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy

        System.out.println();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();  // from Cat
    }
}