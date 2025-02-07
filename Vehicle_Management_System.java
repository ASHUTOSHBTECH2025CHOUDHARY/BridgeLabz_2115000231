class Vehicle{
    //Instance Variables for object
    protected int maxSpeed;
    protected String model;
    //using constructor to initialize
    public Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    //Instance Variables for object
    private int chargingTime;
    //using constructor to initialize
    public ElectricVehicle(int maxSpeed,String model,int chargingTime){
        super(maxSpeed,model);
        this.chargingTime=chargingTime;
    }
    //method charge to check it is charging or not
    public void charge(){
        System.out.println("Vehicle model "+model+" is charging and remaining time is "+this.chargingTime);
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    //Instance Variables for object
    private int avg;
    //using constructor to initialize
    public PetrolVehicle(int maxSpeed,String model,int avg){
        super(maxSpeed,model);
        this.avg=avg;
    }
    //implementing Refuelable methods

    @Override
    public void refuel() {
        System.out.println("Yes this need a refuel");
    }
}
public class Vehicle_Management_System {
    public static void main(String[] args) {
        //Creating and showing Hybrid interface
        PetrolVehicle petrolVehicle=new PetrolVehicle(400,"2025",100);
        petrolVehicle.refuel();

        ElectricVehicle electricVehicle=new ElectricVehicle(200,"2023",2);
        electricVehicle.charge();
    }
}