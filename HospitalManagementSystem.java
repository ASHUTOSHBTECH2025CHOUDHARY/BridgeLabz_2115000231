class Patient{
    //Class members and methods
    private static String hospitalName="Apollo";
    private static int totalPatients=10000;
    public static void  getTotalPatients(){
        System.out.println("Total no of patients in "+hospitalName+" are "+totalPatients);
    }
    // Instance members and methods are;
    private String name;
    private String ailment;
    private int age;
    // using constructor to initialize the patient details
    Patient(String name,String ailment,int age){
        this.name=name;
        this.ailment=ailment;
        this.age=age;
    }
    //Method to display details of patients
    public void displayPatient(){
        System.out.println(this.name+" has a "+this.ailment+" and age is "+this.age);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // displaying total no of patients
        Patient.getTotalPatients();
        // Creating object and initialize using constructor
        Patient neer=new Patient("Nee","Bladness",40);
        if(nee instanceof  Patient){
            neeraj.displayPatient();
        }
        else{
            System.out.println(" Invalid! Instance of given Patient class");
        }
    }
}
