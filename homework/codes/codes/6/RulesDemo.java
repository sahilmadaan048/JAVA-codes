// ==========================================
// Program 6: Overriding Rules
// ==========================================

class A {

    protected Number getValue(int x) {
        System.out.println("Class A Method");
        return x;
    }
}

class B extends A {

    // Increasing visibility: protected -> public
    // Covariant return type: Number -> Integer
    // Same parameter list maintained

    @Override
    public Integer getValue(int x) {
        System.out.println("Class B Method");
        return x * 10;
    }
}

public class RulesDemo {

    public static void main(String[] args) {

        A obj = new B();

        System.out.println("Returned Value: " + obj.getValue(5));
    }
}