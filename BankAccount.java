import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(3000);
        System.out.println(acc.getBalance());

        acc.deposit(2000);
        System.out.println(acc.getBalance());

        try {
            acc.withdraw(1500);
            System.out.println(acc.getBalance());

            acc.withdraw(4000);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}

class BankAccountTest {
    @Test
    void testingDeposit() {
        BankAccount acc = new BankAccount(3000);
        acc.deposit(2000);
        assertEquals(5000, acc.getBalance());
    }

    @Test
    void testingWithdraw() {
        BankAccount acc = new BankAccount(3000);
        acc.withdraw(1500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testingWithdrawInsufficientFunds() {
        BankAccount acc = new BankAccount(3000);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(4000));
    }
}
