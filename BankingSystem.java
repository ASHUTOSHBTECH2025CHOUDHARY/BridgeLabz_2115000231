import java.util.*;

class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            withdrawalQueue.add(accountNumber + " - " + amount);
        } else {
            System.out.println("Insufficient balance or account not found!");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String transaction = withdrawalQueue.poll();
            String[] details = transaction.split(" - ");
            String accountNumber = details[0];
            double amount = Double.parseDouble(details[1]);

            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Processed withdrawal: " + amount + " from Account " + accountNumber);
            } else {
                System.out.println("Failed withdrawal: Insufficient funds for Account " + accountNumber);
            }
        }
    }

    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " - Balance: $" + entry.getKey());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount("ACC123", 5000);
        bank.createAccount("ACC456", 3000);
        bank.createAccount("ACC789", 7000);

        bank.deposit("ACC123", 2000);
        bank.withdraw("ACC456", 1000);
        bank.withdraw("ACC789", 500);

        bank.processWithdrawals();
        System.out.println();
        bank.displaySortedAccounts();
    }
}
