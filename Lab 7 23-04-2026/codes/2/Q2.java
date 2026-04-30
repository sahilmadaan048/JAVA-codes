abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Q2 {
    public static void main(String[] args) {

        // Shape s = new Shape();  // ERROR: Cannot instantiate abstract class

        Shape s = new Circle();   // Superclass reference
        s.draw();
    }
}