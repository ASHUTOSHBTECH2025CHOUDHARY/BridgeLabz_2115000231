class Person{
    //Instance Variables for object
    private String name;
    private int age;
    //using constructor to initialize
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Teacher extends Person{
    //Instance Variables for object
    private String subject;
    //using constructor to initialize
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    //method to type of role
    public void displayRole(){
        System.out.println("This is a teacher");
    }
}
class Student extends Person{
    //Instance Variables for object
    private String grade ;
    //using constructor to initialize
    public Student(String name,int age,String grade ){
        super(name,age);
        this.grade =grade ;
    }
    //method to type of role
    public void displayRole(){
        System.out.println("This is a Student");
    }
}
class Staff  extends Person{
    //Instance Variables for object
    private String Type;
    //using constructor to initialize
    public Staff (String name,int age,String Type){
        super(name,age);
        this.Type=Type;
    }
    //method to type of role
    public void displayRole(){
        System.out.println("This is a Staff ");
    }
}
public class School_System {
    public static void main(String[] args) {
        //Creating and showing its type of subclass
        Teacher teacher=new Teacher("teacher 1",34,"Hindi");
        teacher.displayRole();
        Student student=new Student("Student 1",12,"A");
        student.displayRole();
        Staff staff=new Staff("Staff",43,"Staff");
        staff.displayRole();
    }
}
