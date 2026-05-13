class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}