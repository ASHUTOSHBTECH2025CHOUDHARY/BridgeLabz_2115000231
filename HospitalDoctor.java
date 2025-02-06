import java.util.ArrayList;

class Patient{
    //Instance Variable
    private String name;
    private String illness;
    private ArrayList<Doctor> doctors;
    //using constructor
    Patient(String name,String illness){
        this.name=name;
        this.illness=illness;
        this.doctors=new ArrayList<Doctor>();
    }
    //method to add doctors
    public void addDoctors(Doctor doctor){
        if(!doctors.contains(doctor)) doctors.add(doctor);
    }
    //methods to get name
    public String getName(){
        return this.name;
    }
    //method to get illness
    public String getIllness(){
        return illness;
    }
}
class Doctor{
    // Instance Variables
    private String name;
    private ArrayList<Patient> patients;
    //using constructor
    Doctor(String name){
        this.name=name;
        this.patients=new ArrayList<Patient>();
    }
    //method to get info
    public void Consult(){
        System.out.println(this.name);
        for(Patient i:patients){
            System.out.println(i.getName()+" has a "+i.getIllness());
        }
    }
    //method to add patient
    public void addPatient(Patient patient){
        if(!patients.contains(patient)) patients.add(patient);
        patient.addDoctors(this);
    }
}
class Hospital{
    //Instance variable
    private final String name;
    private ArrayList<Doctor> doctors;
    Hospital(String name){
        this.name=name;
        this.doctors=new ArrayList<Doctor>();
    }
    //method to add doctors
    public void addDoctors(Doctor doctor){
        if(!doctors.contains(doctor)) doctors.add(doctor);
    }
}
public class HospitalDoctor {
    public static void main(String[] args) {
        //Creating Patient
        Patient patient1=new Patient("patient1","illness1");
        Patient patient2=new Patient("patient2","illness2");
        //Creating Doctor
        Doctor doctor=new Doctor("doctor");
        //Creating Hospital
        Hospital hospital=new Hospital("Hospital");

        doctor.addPatient(patient1);
        doctor.addPatient(patient2);
        hospital.addDoctors(doctor);
        doctor.Consult();
    }
}
