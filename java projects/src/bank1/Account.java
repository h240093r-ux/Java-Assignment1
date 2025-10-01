package bank1;

public class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
            recordTransaction(accountName + " deposited " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
            recordTransaction(accountName + " withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }
}
