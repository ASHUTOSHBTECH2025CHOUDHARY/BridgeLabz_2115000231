import java.util.ArrayList;

class Professor{
    //Instance Variable
    private String name;
    //using constructor to initialize object
    Professor(String name){
        this.name=name;
    }
    //method to get professor name
    public String getProfessor(){
        return this.name;
    }
}
class Student{
    //Instance Variable
    private String name;
    private ArrayList<Course> courses;
    //method to initialize object
    Student(String name){
        this.name=name;
        this.courses=new ArrayList<Course>();
    }
    //method to enroll in the course
    public void enrolledCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }
    //method to get student name
    public String getName(){
        return this.name;
    }
    //method to get details
    public void getStudentDetails(){
        System.out.println(this.name+" has enrolled in given courses");
        for(Course i:courses){
            System.out.print(i.getCourseName()+", ");
        }
        System.out.println();
    }
}
class Course{
    //Instance Variable
    private String name;
    private Professor Professor;
    private ArrayList<Student> students;
    //method to add initialize course
    Course(String name){
        this.name=name;
        this.students=new ArrayList<Student>();
    }
    //method to assignprofessor
    public void assignProfessor(Professor professor){
        this.Professor=professor;
    }
    //method to add student te course
    public void addStudent(Student student){
        students.add(student);
    }
    //method to get course name
    public String getCourseName(){
        return this.name;
    }
    //method to display Course details
    public void displayCourseDetails(){
        System.out.println(this.name+" has enrolled students");
        for(Student i:students){
            System.out.println(i.getName());
        }
    }
}
public class College {
    public static void main(String[] args) {
        //Creating Professor
        Professor professor=new Professor("Mukesh singh");
        //Creating student
        Student Ashutosh=new Student("Ashutosh Choudhary");
        //Creating Course
        Course Computer=new Course("Computer Science");
        //assigning professor to the course
        Computer.assignProfessor(professor);
        //enrolling student in the course
        Ashutosh.enrolledCourse(Computer);
        Computer.displayCourseDetails();
    }
}
