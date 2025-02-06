import java.util.ArrayList;

class Student{
    // Instance Variable
    private String name;
    private ArrayList<Course> courses;
    // using constructor to initializing object
    Student(String name){
        this.name=name;
        this.courses=new ArrayList<Course>();
    }
    //method to add courses
    public void addCourse(Course course){
       if(!courses.contains(course)) courses.add(course);
    }
    // method to get student name
    public String getStudent(){
        return this.name;
    }
    //method to show the courses enrolled
    public void displayCourse(){
        System.out.println(this.name+" is enrolled in these courses");
        for(Course i:courses){
            System.out.print(i.getCourse()+",");
        }
        System.out.println();
    }
}
class Course{
    // Instance variable
    private String name;
    private ArrayList<Student> students;
    // constructor to initialize object
    Course(String name){
        this.name=name;
        this.students=new ArrayList<Student>();
    }
    //method to enrolled student in course
    public void getCourseDetails(){
        System.out.print("In course of "+ this.name+" ");
        for(Student i:students){
            System.out.print(i.getStudent()+", ");
        }
        System.out.println("are enrolled.");
    }
    //method to get course name
    public String getCourse(){
        return this.name;
    }
    //method to add student
    public void addStudent(Student student){
        if(!students.contains(student)) students.add(student);
    }
}
class School{
    // Instance variable
    private final String schoolName;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    // method to initialize object
    School(String schoolName){
        this.schoolName=schoolName;
        this.students=new ArrayList<Student>();
    }
    //method to add student in school
    public void addStudentAndCourse(Student student,Course course){
        student.addCourse(course);
        course.addStudent(student);
        if(!students.contains(student)) students.add(student);
    }
    //method to show school Details
    public void getDetails(){
        System.out.println("School "+this.schoolName);
        for(Student i:students){
            i.displayCourse();
        }
    }
}
public class SchoolAndStudents {
    public static void main(String[] args) {
        //Creating Student object
        Student ashutosh=new Student("Ashutosh");
        //Creating Course object
        Course ComputerScience=new Course("CSE");
        Course NPTEL=new Course("NPTEL");
        //Creating school object
        School GLA_University=new School("GLA University");
        GLA_University.addStudentAndCourse(ashutosh,ComputerScience);
        GLA_University.addStudentAndCourse(ashutosh,NPTEL);
        GLA_University.getDetails();
    }
}
