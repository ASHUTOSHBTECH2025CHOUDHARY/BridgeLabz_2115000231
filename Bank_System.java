    class BankAccount{
        //Instance Variables for  object
        protected String accountNumber;
        protected double balance;
        //using constructor to initialize
        public BankAccount(String accountNumber,double balance){
            this.accountNumber=accountNumber;
            this.balance=balance;
        }
        //method to show details
        public void getAccount(){
            System.out.println(this.accountNumber+"<-Account Number and balance->"+this.balance);
        }
    }
    class SavingsAccount extends BankAccount{
        //Instance Variables for object
        private int InterestRate;
        //using constructor to initialize
        public  SavingsAccount(String accountNo,double balance,int InterestRate){
            super(accountNo,balance);
            this.InterestRate=InterestRate;
        }
        //method to get show displayAccountType()
        public void displayAccountType(){
            System.out.println("This is a saving account.");
        }
    }
    class CheckingAccount extends BankAccount{
        //Instance Variables for object
        private int withDrawalLimit ;
        //using constructor to initialize
        public CheckingAccount(String accountNo,double balance,int withdrawalLimit ){
            super(accountNo,balance);
            this.withDrawalLimit =withdrawalLimit ;
        }
        //method to get show displayAccountType()
        public void displayAccountType(){
            System.out.println("This is a Checking account.");
        }
    }
    class FixedDepositAccount  extends BankAccount{
        //Instance Variables for object
        private int minimumdeposit;
        //using constructor to initialize
        public FixedDepositAccount (String accountNo,double balance,int minimumdeposit){
            super(accountNo,balance);
            this.minimumdeposit=minimumdeposit;
        }
        //method to get show displayAccountType()
        public void displayAccountType(){
            System.out.println("This is a Fixed account.");
        }
    }
    public class Bank_System {
        public static void main(String[] args) {
            //Creating and showing its type of subclass
            FixedDepositAccount fixedAccount=new FixedDepositAccount("3498aesf0349",34983443.34,343434);
            fixedAccount.displayAccountType();

            SavingsAccount savingsAccount=new SavingsAccount("343aksjfh498",3948394.93,3);
            savingsAccount.displayAccountType();

            CheckingAccount checkingAccount=new CheckingAccount("3498kjsa8439",3984394.3984,34343434);
            checkingAccount.displayAccountType();

        }
    }
