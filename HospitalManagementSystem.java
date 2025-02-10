import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Using constructor to initialize object
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();

    // Method to retrieve patient details
    public String getPatientDetails() {
        return String.format("Patient ID: %d, Name: %s, Age: %d", patientId, name, age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> records;

    // Using constructor to initialize object and calling parent constructor
    public InPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    // Implementing abstract method
    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    // Implementing interface methods
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        records.forEach(record -> System.out.println("- " + record));
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    // Using constructor to initialize object and calling parent constructor
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    // Implementing abstract method
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing interface methods
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        records.forEach(record -> System.out.println("- " + record));
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient john = new InPatient(101, "John Doe", 45, 500, 5);
        OutPatient emily = new OutPatient(102, "Emily Smith", 30, 200);

        john.addRecord("Underwent surgery");
        emily.addRecord("Regular health checkup");

        patients.add(john);
        patients.add(emily);

        patients.forEach(patient -> {
            System.out.println(patient.getPatientDetails());
            System.out.printf("Total Bill ", patient.calculateBill());

            if (patient instanceof MedicalRecord medicalRecord) {
                medicalRecord.viewRecords();
            }
            System.out.println();
        });
    }
}

