class NumberPrinter {

    synchronized void printEven() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    synchronized void printOdd() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenThread extends Thread {
    NumberPrinter np;

    EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}

class OddThread extends Thread {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

public class EvenOddDemo {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();

        EvenThread t1 = new EvenThread(np);
        OddThread t2 = new OddThread(np);

        t1.start();
        t2.start();
    }
}