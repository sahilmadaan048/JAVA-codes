class Dog {
    String name;
    int age;

    Dog(String n, int a) {
        name = n;
        age = a;
    }

    void setData(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DogDemo {
    public static void main(String[] args) {

        Dog d1 = new Dog("", 0);
        d1.name = "Tommy";
        d1.age = 3;

        Dog d2 = new Dog("", 0);
        d2.setData("Bruno", 5);

        Dog d3 = new Dog("Rocky", 4);

        d1.display();
        d2.display();
        d3.display();
    }
}