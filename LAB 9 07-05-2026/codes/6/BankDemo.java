class BankAccount {
    private int balance = 1000;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName()
                + " Deposited: " + amount
                + " Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " Withdrawn: " + amount
                    + " Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        DepositThread t1 = new DepositThread(acc);
        WithdrawThread t2 = new WithdrawThread(acc);

        t1.setName("Deposit Thread");
        t2.setName("Withdraw Thread");

        t1.start();
        t2.start();
    }
}