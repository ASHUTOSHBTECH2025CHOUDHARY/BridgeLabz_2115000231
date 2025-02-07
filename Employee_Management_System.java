class Employee{
    //Variables of the Employee class
    private String name;
    private int    id;
    private double salary;
    //using constructor to initialize employee object
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //method to implement in the subclass
    public void displayInfo(){}
    // getter for all vaiables
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    //Instance variable
    private int TeamSize;
    //using constructor to initialize manager object
    Manager(String name,int id,double salary,int TeamSize){
        super(name,id,salary);
        this.TeamSize=TeamSize;
    }
    @Override public void displayInfo(){
        System.out.println(this.getName()+" has a id, salary and team size "+this.getId()+","+this.getSalary()+","+this.TeamSize);
    }
}
class Developer extends Employee{
    //Instance variable
    private String programmingLanguage;
    //using constructor to initialize Developer object
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override public void displayInfo(){
        System.out.println(this.getName()+" has a id, salary and programming language "+this.getId()+","+this.getSalary()+","+this.programmingLanguage);
    }
}
class Intern extends Employee{
    //Instance variable
    private final int internshipDuration;
    //using constructor to initialize Intern object
    Intern(String name,int id,double salary,int internshipDuration){
        super(name,id,salary);
        this.internshipDuration=internshipDuration;
    }
    @Override public void displayInfo(){
        System.out.println(this.getName()+" has a id, salary and team size "+this.getId()+","+this.getSalary()+","+this.internshipDuration);
    }
}
public class Employee_Management_System {
    public static void main(String[] args) {
        //Creating subclass objects using constructor to initialize
        Manager manager=new Manager("Manager",34,430933.0,4);
        Developer developer=new Developer("Developer",324,439834,"c++");
        Intern intern=new Intern("intern",4334,3945834,6);
        // showing method overriding
        manager.displayInfo();
        developer.displayInfo();
        intern.displayInfo();
    }
}