
class Employee {
    //Employee Attribute
    public String employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize the Employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //getter Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // setter method to set a new salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    // Constructor for Manager and using parent constructor by super
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void showManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary " + getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an employee object using constructor
        Employee emp1 = new Employee("2345", "Engineering", 60000.00);
        emp1.showEmployeeDetails();
        // Create a manager object using constructor
        Manager mgr1 = new Manager("4321", "Market", 80000.00);
        mgr1.showManagerDetails();
        // Modify and show updated salary
        emp1.setSalary(65000.00);
        System.out.println("Salary of Employee 1 after modification " + emp1.getSalary());
    }
}

