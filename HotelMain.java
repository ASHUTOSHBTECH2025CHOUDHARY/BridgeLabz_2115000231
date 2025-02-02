import java.util.Scanner;

class HotelBooking{
    //declaration of private variables
    private String guestName;
    private String roomType;
    private int nights;
    // Constructor to initialize variables of object
    HotelBooking(){
        this.guestName="Unknown";
        this.roomType="Standard";
        this.nights=0;
    }
    // Parameterized Constructor to initialize variables by user input
    HotelBooking(String guestName,String roomType,int nights){
        this.nights=nights;
        this.roomType=roomType;
        this.guestName=guestName;
    }
    //Copy constructor to make copy of an object
    HotelBooking(HotelBooking guest){
        this.nights=guest.nights;
        this.guestName=guest.guestName;
        this.roomType=guest.roomType;
    }
    // Getter function to show details of Guests
    public void showdetails(){
        System.out.println("Guest "+this.guestName+" booked "+this.roomType+" room for "+this.nights+" nights");
    }
}

public class HotelMain {
    public static void main(String [] args){
        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guest name:-");
        String guestName=sc.nextLine();
        System.out.println("Enter the room type(Standard,Luxury):-");
        String roomType=sc.nextLine();
        System.out.println("Enter the Number of nights to stay:-");
        int nights= sc.nextInt();
        //using constructor to initialize with default values
        HotelBooking guest1=new HotelBooking();
        //using parameterized constructor to initialize with user input
        HotelBooking guest2=new HotelBooking(guestName,roomType,nights);
        //using copy constructor to make copy of guest2 constructor
        HotelBooking copyGuest2=new HotelBooking(guest2);
        //Showing details of guests using getter function
        guest1.showdetails();
        guest2.showdetails();
        copyGuest2.showdetails();
    }
}
