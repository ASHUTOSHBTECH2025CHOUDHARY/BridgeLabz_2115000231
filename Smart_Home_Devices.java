class Device{
    //Instance Variables of class Device
    private String status;
    private int    deviceId;
    //using constructor to initializing methods
    Device(String status,int deviceId){
        this.deviceId=deviceId;
        this.status=status;
    }
    //getter function for instance variables
    public String getStatus(){
        return status;
    }
    public int getDeviceId(){
        return deviceId;
    }
    //method which will override by subclass
    public void displayStatus(){}
}
class Thermostat extends Device{
    //Instance Variables of class Thermostat
    private int temperatureSetting;
    //using constructor to initializing methods
    Thermostat(int temperatureSetting,String status,int deviceId){
        super(status,deviceId);
        this.temperatureSetting=temperatureSetting;
    }
    //method to display Thermostat details
    public void displayStatus(){
        System.out.println(this.temperatureSetting+", "+" with id and status "+this.getDeviceId()+" in year "+this.getStatus());
    }
}
public class Smart_Home_Devices {
    public static void main(String[] args) {
        //Creating subclass object
        Thermostat room1=new Thermostat(26,"Summer",43434);
        //calling method to get details
        room1.displayStatus();
    }
}
