class vehicle{
    //Instance Variable
    private String ownerName;
    private String vehicleType;
    //Class Variable
    private static int registrationFee=500;
    //Initializing object with constructor
    vehicle(String ownerName,String vehicleType){
        this.vehicleType=vehicleType;
        this.ownerName=ownerName;
    }
    //Method to display vehicle details
    public void  displayVehicleDetails(){
        System.out.println("Owner Name " + ownerName);
        System.out.println("Vehicle Type " + vehicleType);
        System.out.println("Registration Fee " + registrationFee);
    }
    //Method to update registration fees
    public static void  updateRegistrationFee(int fee){
        registrationFee=fee;
    }
}
public class VechilRegistration {
    public static void main(String[] args) {
        //Creating and initializing object
        vehicle car=new vehicle("Ashutosh Choudahry","Four Vehicle");
        vehicle bike=new vehicle("Choudhary sahab","two wheeler");
        //displaying details of vehicles
        car.displayVehicleDetails();
        bike.displayVehicleDetails();
        //updaing the registration fee by using class method
        vehicle.updateRegistrationFee(1000);
        //displaying details of vehicles after updation
        car.displayVehicleDetails();
        bike.displayVehicleDetails();
    }
}
