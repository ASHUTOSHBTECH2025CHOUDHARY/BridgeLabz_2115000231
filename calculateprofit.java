public class calculateprofit {
    public static void main(String [] args){
        int cost_price=129;
        int selling_price=191;
        int profit= selling_price-cost_price;
        double profit_percentage=profit/(cost_price * 100.0);
        System.out.println("The Cost Price is "+cost_price +" INR and Selling Price is "+selling_price+" INR.");
        System.out.println("The Profit is INR "+ profit+" and the Profit Percentage is "+profit_percentage);
    }
}