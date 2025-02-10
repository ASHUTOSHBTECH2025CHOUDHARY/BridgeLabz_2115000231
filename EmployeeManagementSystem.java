import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    //Variable of Employee class
    private int employeeId;
    private String name;
    private int baseSalary;
    //using constructor to initialize object
    public Employee(int employeeId,String name,int baseSalary){
        this.name=name;
        this.employeeId=employeeId;
        this.baseSalary=baseSalary;
    }
    //getter method of Employee
    public int getEmployeeId(){
        return employeeId;
    }
    protected int getBaseSalary(){
        return baseSalary;
    }
    public String getName(){
        return name;
    }
    //abstract method and concrete for calculate and display salary
    public abstract int calculateSalary();
    public void displayDetails(){
        System.out.println(this.name+" has a employee id "+this.employeeId +" with a base salary of "+calculateSalary());
    };
}
interface Department{
    void  assignDepartment(String department);
    void getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department{
    //Instance Variables of FullTimeEmployee class
    private String department;
    //using constructor to initialize object and calling parent constructor
    public FullTimeEmployee(int employeeId,String name,int baseSalary){
        super(employeeId,name,baseSalary);
    }
    //implementing abstract methods
    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("this employee is in "+this.department);
    }
}
class PartTimeEmployee extends Employee implements Department{
    //Instance Variables of PartTimeEmployee class
    private String department;
    private int duration;
    //using constructor to initialize object and calling parent constructor
    public PartTimeEmployee(int employeeId,String name,int baseSalary,int duration){
        super(employeeId,name,baseSalary);
        this.duration=duration;
    }
    //implementing abstract methods

    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("this part time employee is in "+this.department);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //Creating a List of Employee
        List<Employee> employees=new ArrayList<Employee>();
        //Creating objects of subclasses and initializing using constructor
        FullTimeEmployee ashutosh=new FullTimeEmployee(3234,"Ashutosh",400000);
        ashutosh.assignDepartment("Software developer");

        PartTimeEmployee GLA_Students=new PartTimeEmployee(34434,"Student",0,2);
        GLA_Students.assignDepartment("Software Trainee");
        //adding employee in the employees
        employees.add(ashutosh);

        employees.add(GLA_Students);
        ashutosh.getDepartmentDetails();
        //showing the details for employees
        for(Employee i:employees){
            i.displayDetails();
            if (i instanceof Department) {
                ((Department) i).getDepartmentDetails();
            }
            System.out.println(i.getName()+" has a salary of "+ i.calculateSalary());
        }
    }
}
