interface Test {
    void show();
    void display();
}

abstract class Demo implements Test {

    public void show() {
        System.out.println("Show method implemented.");
    }
    // public void display();// not implemented
}

class FinalDemo extends Demo {

    public void display() {
        System.out.println("Display method implemented.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.show();
        f.display();
    }
}