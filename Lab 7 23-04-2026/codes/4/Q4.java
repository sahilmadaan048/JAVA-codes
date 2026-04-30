abstract class Bank {

    final void rules() {
        System.out.println("Bank rules are fixed and cannot be changed.");
    }

    abstract void interest();
}

class SBI extends Bank {

    void interest() {
        System.out.println("SBI provides 6% interest.");
    }

    // Cannot override final method
    // void rules() {}  // ERROR if uncommented
}

public class Q4 {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.rules();
        s.interest();
    }
}