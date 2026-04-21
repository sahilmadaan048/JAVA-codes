class Printer {

    private static Printer obj1;
    private static Printer obj2;
    private static int count = 0;

    private Printer() {
        System.out.println("Printer Object Created");
    }

    public static Printer getInstance() {

        if (count == 0) {
            obj1 = new Printer();
            count++;
            return obj1;
        }

        else if (count == 1) {
            obj2 = new Printer();
            count++;
            return obj2;
        }

        else {
            System.out.println("Only two objects allowed!");
            return null;
        }
    }
}

public class DoubletonDemo {
    public static void main(String[] args) {

        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        Printer p3 = Printer.getInstance();   // Not allowed
    }
}