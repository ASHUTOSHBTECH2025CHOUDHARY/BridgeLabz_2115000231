class Student{
    // Class members and methods;
    private static String universityName="GLA University";
    private static int    totalStudents=5000;
    public static void  displayTotalStudents(){
        System.out.println("Total no of students in GLA University is "+totalStudents);
    }
    //Instance members and methods
    private String name;
    private char  grade;
    private final int  rollno;
    //constructor to initialize Student object;
    Student(String name,char grade,int rollno){
        this.name=name;
        this.grade=grade;
        this.rollno=rollno;
    }
    //Method to display Student details
    public void displayStudents(){
        System.out.println(this.name+" has a roll no "+ this.rollno+" with a grade of "+this.grade);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        //displaying total no of students
        Student.displayTotalStudents();
        // Creating object and initialize using constructor
        Student ashutosh=new Student("Ashutosh",'A',211500231);
        if(ashutosh instanceof Student){
            ashutosh.displayStudents();
        }
        else{
            System.out.println(" Invalid! Instance of given Students class");
        }
    }
}
