interface Printer {
    void print();
    void scan();
}

abstract class Machine implements Printer {

    public void print() {
        System.out.println("Printing document...");
    }
    // scan() not implemented
}

class HP extends Machine {

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Q8 {
    public static void main(String[] args) {
        HP h = new HP();
        h.print();
        h.scan();
    }
}