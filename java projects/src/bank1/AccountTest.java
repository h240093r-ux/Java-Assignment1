package bank1;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("Takunda Tafadzwa", 500);

        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(700); // exceeds balance
        acc.getBalance();
    }
}
