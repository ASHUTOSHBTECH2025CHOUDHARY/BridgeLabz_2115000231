import java.io.*;

public class StoreAndReterive {
    public static void main(String[] args) {
        String file = "studentData.bin";

        // Writing student data to a binary file
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeInt(101); // Roll Number
            out.writeUTF("Ashutosh Choudhary"); // Name
            out.writeDouble(8.9); // GPA
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading student data from the binary file
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int roll = in.readInt();
            String name = in.readUTF();
            double gpa = in.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
