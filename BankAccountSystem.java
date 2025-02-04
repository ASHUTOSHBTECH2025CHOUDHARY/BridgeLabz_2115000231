class BankAccount{
    // class member and method
    public static String bankName="HDFC";
    public static int totalBankAccount=0;
    public static  void getTotalAccounts(){
        System.out.println("Total no of Accounts are "+totalBankAccount);
    }
    //Instance variable and method
    public String accountHolderName;
    public final String accountNumber;
    BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }
    //getter method for show BankAccount details
    public void showAccountDetails(){
        System.out.println(this.accountHolderName+" account number is "+this.accountNumber);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating object and initialize using constructor
        BankAccount account1=new BankAccount("34353534kd","Hemmant");
        // checking is account1 is instance of BankAccount
        if(account1 instanceof BankAccount){
            account1.showAccountDetails();
        }
        else{
            System.out.println(" Invalid! Instance of given BankAccount class");
        }
    }
}
