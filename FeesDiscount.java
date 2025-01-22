public class FeesDiscount {
    public  static  void  main(String [] args){
        int fee=1250000;
        int discountPercent=10;
        int discount=(fee*discountPercent)/100;
        System.out.println("The discount amount is "+discount+" and final discounted fee is INR "+(fee-discount));
    }
}