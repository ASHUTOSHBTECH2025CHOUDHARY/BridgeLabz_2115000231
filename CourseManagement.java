class Course{
    // Instance Variable
    private String courseName;
    private int duration;
    private int fee;
    // Class Variable
    private static String instituteName="GLA University";
    //Constructor to  initialize course object
    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    //Instance method to display course details
    public void displayCourseDetails(){
        System.out.println("Institute " + instituteName);
        System.out.println("Course Name " + courseName);
        System.out.println("Duration " + duration + " months");
        System.out.println("Fee " + fee);
    }
    // Class Method to update instituteName
    public static void updateInstituteName(String institute){
        instituteName=institute;
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        // Creating Course object using constructor
        Course course1=new Course("Java Programming",6,500);
        Course course2=new Course("web development",4,400);
        // Displaying details before updating the institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        //updating institute name
        Course.updateInstituteName("BridgeLabz");
        // Displaying details after updating the institute name
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
