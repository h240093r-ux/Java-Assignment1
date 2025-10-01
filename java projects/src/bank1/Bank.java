package bank1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Record transaction to a file
    protected void recordTransaction(String message) {
        try (FileWriter fw = new FileWriter("Bank.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
