class DaemonThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class DaemonDemo {
    public static void main(String[] args) {

        DaemonThread d = new DaemonThread();

        d.setDaemon(true);

        d.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("User Thread Running...");
        }

        System.out.println("Main Thread Finished");
    }
}