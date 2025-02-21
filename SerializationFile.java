import java.io.*;
import java.util.*;

class Employee implements Serializable {
    //Instance Variable
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SerializationFile {
    public static void main(String[] args) {
        String file = "employees.dat";
        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee(1, "Jasdf", "HR", 50000));
        staff.add(new Employee(2, "asdfasdf", "IT", 60000));
        staff.add(new Employee(3, "asdfasdf", "Fiadsf", 70000));

        // Serialize employee list
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(staff);
            System.out.println("Employee data serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize employee list
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            List<Employee> loadedStaff = (List<Employee>) in.readObject();
            System.out.println("Deserialized Employee Data:");
            for (Employee emp : loadedStaff) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}