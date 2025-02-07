class Vehicle{
    //Instance variables
    private int maxSpeed;
    private String fuelType;
    //using constructor for initializing object
    Vehicle(String fuelType,int maxSpeed){
        this.fuelType=fuelType;
        this.maxSpeed=maxSpeed;
    }
    // getter for Vehicle object
    public String getFuelType(){
        return fuelType;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    //method which will be override by sub class
    public void displayInfo(){}
}
class Car extends Vehicle{
    //Instance variable for class
    private int seatCapacity;
    //using constructor to initialize object
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(fuelType,maxSpeed);
        this.seatCapacity=seatCapacity;
    }
    // method to display details
   @Override public void displayInfo(){
        System.out.println("Car has "+this.seatCapacity+" and a max speed and fuel type "+this.getFuelType()+", "+this.getMaxSpeed());
    }
}
class Truck extends Vehicle{
    //Instance variable for class
    private int LoadCapacity;
    //using constructor to initialize object
    Truck(int maxSpeed,String fuelType,int LoadCapacity){
        super(fuelType,maxSpeed);
        this.LoadCapacity=LoadCapacity;
    }
    // method to display details
    @Override public void displayInfo(){
        System.out.println("Truck has "+this.LoadCapacity+" and a max speed and fuel type "+this.getFuelType()+", "+this.getMaxSpeed());
    }
}
class MotorCycle extends Vehicle{
    //Instance variable for class
    private double avg;
    //using constructor to initialize object
    MotorCycle(int maxSpeed,String fuelType,double avg){
        super(fuelType,maxSpeed);
        this.avg=avg;
    }
    // method to display details
   @Override public void displayInfo(){
        System.out.println("Motor Cycle has "+this.avg+" and a max speed and fuel type "+this.getFuelType()+", "+this.getMaxSpeed());
    }
}
public class Vehicle_Transport_System {
    public static void main(String[] args) {
        // Creating objects of subclass
        Car mercedes=new Car(200,"Petrol",2);
        Truck laaltruck=new Truck(150,"Diesel",4000);
        MotorCycle Harley=new MotorCycle(400,"Petrol",50.0);
        //calling displayInfo to get details
        mercedes.displayInfo();
        laaltruck.displayInfo();
        Harley.displayInfo();
    }
}
