import java.util.Scanner;

// Custom exception for insufficient funds
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Class representing a bank account
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance " + balance);
    }
}

public class BankTransition {
    public static void main(String[] args) {
        // Initial balance
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

        input.close();
    }
}
