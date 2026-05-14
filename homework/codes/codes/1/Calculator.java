// ==========================================
// Program 1: Method Overloading - Calculator
// ==========================================

public class Calculator {

    // int addition
    int add(int a, int b) {
        return a + b;
    }

    // float addition
    float add(float a, float b) {
        return a + b;
    }

    // double addition
    double add(double a, double b) {
        return a + b;
    }

    // varying number of parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Int Add: " + c.add(10, 20));
        System.out.println("Float Add: " + c.add(10.5f, 20.5f));
        System.out.println("Double Add: " + c.add(11.22, 33.44));
        System.out.println("Three Int Add: " + c.add(1, 2, 3));
    }
}