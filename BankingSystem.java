import java.util.ArrayList;

// Interface for loan eligibility
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount implements Loanable {
    //Variable of BankAccount
    private String accountNumber;
    private String holderName;
    protected double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods for account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    @Override
    public boolean applyForLoan(double amount) {
        return balance >= amount * 0.5;
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 2; // Eligible for loan up to twice the balance
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private final double INTEREST_RATE = 0.04; // 4% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        // Creating a list of different bank account types
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "Alice", 5000));
        accounts.add(new CurrentAccount("CUR456", "Bob", 10000));

        // Processing accounts and calculating interest dynamically
        for (BankAccount account : accounts) {
            System.out.println("Account Holder " + account.getHolderName());
            System.out.println("Account Number " + account.getAccountNumber());
            System.out.println("Balance " + account.getBalance());
            System.out.println("Interest Earned " + account.calculateInterest());
            System.out.println("Loan Eligibility" + account.calculateLoanEligibility());
        }
    }
}
