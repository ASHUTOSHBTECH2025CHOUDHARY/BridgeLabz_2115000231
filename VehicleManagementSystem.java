import java.util.Scanner;

class Vehicle{
    // class members and methods
    private static int registrationFee=5000;
    public static void updateRegistrationFee(int fee){
        System.out.println("Updated registration fees is "+fee);
        registrationFee=fee;
    }
    // Instance members and methods are
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    // using constructor to initialize the Vehicle details;
    Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    //method to display Vehicle details
    public void displayVehicle(){
        System.out.println(this.ownerName+" has a "+this.vehicleType+" with a registration number of "+this.registrationNumber);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("Please enter the new registration fees");
        // taking input of new registration fees
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        Vehicle.updateRegistrationFee(fee);
        //Creating a object of Vehicle and  displaying its details
        Vehicle car=new Vehicle("Ashutosh Choudhary","4-Wheeler",1982347);
        //checking is car is a instance of Vehicle
        if(car instanceof Vehicle){
            car.displayVehicle();
        }
        else{
            System.out.println(" Invalid! Instance of given Vehicle class");
        }
    }
}
