
class Box {
    double length, breadth, height;

    Box() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(); // default
        Box b2 = new Box(2, 3, 4); // parameterized

        System.out.println("Volume of Box 1: " + b1.volume());
        System.out.println("Volume of Box 2: " + b2.volume());
    }
}