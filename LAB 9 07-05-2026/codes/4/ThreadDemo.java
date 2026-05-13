class MyThread extends Thread {

    public MyThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Priority: " + getPriority());
        System.out.println("State: " + getState());

        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-A", Thread.MAX_PRIORITY);
        MyThread t2 = new MyThread("Thread-B", Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}