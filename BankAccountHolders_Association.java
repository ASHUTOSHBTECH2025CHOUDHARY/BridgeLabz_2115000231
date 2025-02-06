import java.lang.reflect.Array;
import java.util.ArrayList;

class BankAccount{
    //instance variables
    private String accountNumber;
    private int    deposit;
    //method tho initializing the BankAccount object using constructor
    BankAccount(String accountNumber,int deposit){
        this.accountNumber=accountNumber;
        this.deposit=deposit;
    }
    //method to display account details
    public String displayAccountNumber(){
        return accountNumber;
    }
    public int displaydeposit(){
        return deposit;
    }
}
class Customer{
    //instance variables
    private final String  customerName;
    private ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
    //method to initialize customername;
    Customer(String customerName){
        this.customerName=customerName;
    }
    //methods to add and display accounts of customers
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void viewBalance(){
        for(BankAccount i:accounts){
            System.out.println(customerName+" has a deposit of in account number "+i.displayAccountNumber()+" "+i.displaydeposit());
        }
    }
}
class Bank{
    //Instance variables
    private String Bankname;
    private ArrayList<Customer> customers=new ArrayList<Customer>();
    // methods to initialize object
    Bank(String bankname){
        this.Bankname=bankname;
    }
    // opening bank account
    public void openAccount(Customer customer,BankAccount account){
        customer.addAccount(account);
        if(customers.isEmpty()||(!customers.contains(customer))) customers.add(customer);
    }
}
public class BankAccountHolders_Association {
    public static void main(String[] args) {
        //Creating customer object
        Customer ashutosh=new Customer("Ashutosh");
        // Creating bankaccount
        BankAccount account1=new BankAccount("4398we7rh",49590485);
        BankAccount account2=new BankAccount("84kjfh8439",43094095);
        //Creating Bank object
        Bank Yesbank=new Bank("Yes Bank");
        //adding customer to bank;
        Yesbank.openAccount(ashutosh,account1);
        Yesbank.openAccount(ashutosh,account2);
        ashutosh.viewBalance();
    }
}
