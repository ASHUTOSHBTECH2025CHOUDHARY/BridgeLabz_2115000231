// Base class: BankAccount
class BankAccount {
    // BankAccount Attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter method to get the balance
    public double getBalance() {
        return balance;
    }

    // setter method to set a new balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to show account details
    public void showAccountDetails() {
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Holder " + accountHolder);
        System.out.println("Balance " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    // Constructor for SavingsAccount and calling parent constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to show details of SavingsAccount
    public void showSavingsDetails() {
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Holder " + accountHolder);
        // Private, can't access directly
        System.out.println("Balance" + getBalance());
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object using constructor
        BankAccount account1 = new BankAccount("123456", "Amit", 10000.00);
        account1.showAccountDetails();

        // Creating a SavingsAccount object
        SavingsAccount savings1 = new SavingsAccount("094321", "Priya", 15000.50);
        savings1.showSavingsDetails();

        // Modifying balance using setter
        account1.setBalance(12000.00);
        System.out.println("Balance of  Account 1 after modification" + account1.getBalance());
    }
}
