class Course{
    //Instance Variables for course object
    private String CourseName;
    private int    duration;
    //using constructor for initialize
    Course(String CourseName,int duration){
        this.CourseName=CourseName;
        this.duration=duration;
    }
    //getter method for getting course name and duration
    public String getCourseName(){
        return CourseName;
    }
    public int getDuration(){
        return duration;
    }
    //method to get course details
    public void getDetails(){
        System.out.println(this.CourseName+" and "+this.duration);
    }
}
class OnlineCourse extends Course{
    //Instance Variables of OnlineCourse
    private String platform;
    private Boolean isRecorded;
    //using constructor for OnlineCourse
    OnlineCourse(String CourseName,int duration,String platform,Boolean isRecorded){
        super(CourseName,duration);
        this.isRecorded=isRecorded;
        this.platform=platform;
    }
    //method to get course details
    public void getDetails(){
        System.out.println(this.getCourseName()+"is recorded "+(this.isRecorded?"Yes":"No")+" on a platform "+this.platform);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    //Instance Variables of object
    private int fees;
    private int discount;
    //using constructor to initialize object
    PaidOnlineCourse(String CourseName,int duration,String platform,Boolean isRecorded,int fees,int discount){
        super(CourseName,duration,platform,isRecorded);
        this.fees=fees;
        this.discount=discount;
    }
    //method to get details
    public void getDetails(){
        System.out.println("fees with discount is "+(this.fees-this.discount));
    }
}
public class Educational_Course {
    public static void main(String[] args) {
        //Creating Object of paid Online course to show multilevel inheritance
        PaidOnlineCourse Java=new PaidOnlineCourse("Java",5,"Coding blocks",true,5000,1000);
        Java.getDetails();
        System.out.println("Course Name and its duration "+Java.getCourseName()+", "+Java.getDuration());
    }
}
