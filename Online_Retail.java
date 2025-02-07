    class Order{
        //Instance Variables
        private String orderId;
        private String orderDate;
        //using constructor to initialize Order
        Order(String orderDate,String orderId){
            this.orderDate=orderDate;
            this.orderId=orderId;
        }
        //getter to get the orderid and orderdate
        public String getOrderId(){
            return orderId;
        }
        public String getOrderDate(){
            return orderDate;
        }
        //method to get order status
        public void getOrderStatus(){
            System.out.println("Order placed");
        }
    }
    class ShippedOrder extends Order{
        //Instance Variables
        private String trackingNumber;
        //using constructor to initialize shipped order
        ShippedOrder(String orderId,String orderDate,String trackingNumber){
            super(orderDate,orderId);
            this.trackingNumber=trackingNumber;
        }
        //method to show order status
        public void getOrderStatus(){
            System.out.println("Order trackingNumber,"+this.trackingNumber);
        }
    }
    class  DeliveredOrder extends ShippedOrder{
        //Instance Variables
        private String deliveryDate;
        //using constructor to initialize delivery order
        DeliveredOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){
            super(orderId,orderDate,trackingNumber);
            this.deliveryDate=deliveryDate;
        }
        //method to show delivery status
        public void getOrderStatus(){
            System.out.println("Order is delivered on "+this.deliveryDate);
        }
    }
    public class Online_Retail {
        public static void main(String[] args) {
            //creating Delivered order to show the multilevel inheritance
            DeliveredOrder delivery=new DeliveredOrder("349839834","06-02-2025","asldfjasdfkjasdf","10-02-2025");
            delivery.getOrderStatus();
            System.out.println("Order date "+delivery.getOrderDate());
            System.out.println("Order Id "+delivery.getOrderId());
            //creating Shipped order to show the multilevel inheritance
            ShippedOrder Shipped=new ShippedOrder("3498834","08-02-2025","asldfjasdfsdfkjasdf");
            Shipped.getOrderStatus();
        }
    }
