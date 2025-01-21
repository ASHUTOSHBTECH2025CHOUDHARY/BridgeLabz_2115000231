public class FeesDiscount {
    public  static  void  main(String [] args){
        int fee=1250000;
        int dicountPercent=10;
        int dicount=(fee*dicountPercent)/100;
        System.out.println("The discount amount is "+dicount+" and final discounted fee is INR "+(fee-dicount));
    }
}