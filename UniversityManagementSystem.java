    class Student{
        // Declaration of variable
        public int rollNumber;
        protected String name;
        private double CGPA;
        //Parameterized constructor to initialize Student
        Student(int rollNumber,String name,double CGPA){
            this.rollNumber=rollNumber;
            this.CGPA=CGPA;
            this.name=name;
        }
        //public method to get CGPA
        public double getCGPA(){
            return this.CGPA;
        }
        //public method to set CGPA
        public void setCGPA(double CGPA){
            this.CGPA=CGPA;
        }
        //method to get the details of student
        public void displayMethodDetails(){
            System.out.println("Roll Number " + rollNumber);
            System.out.println("Name " + name);
            System.out.println("CGPA " + CGPA);
        }
    }
    //Subclass
    public class PostgraduateStudent extends Student{
        private String special;
        //Constructor for initialing
        public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
            super(rollNumber, name, CGPA); // Call superclass constructor
            this.researchTopic = researchTopic;
        }
        //displaying student details
        @Override public void displayStudentDetails() {
            super.displayMethodDetails(); // Call parent class method
            System.out.println("Research Topic: " + special);
        }
    }
    public class UniversityManagementSystem {
        public static void main(String[] args) {
            // Creating Student object and initializing using Constructor
            Student student1=new Student(1,"Akash",7);
            student1.displayMethodDetails();
            System.out.println();
            //Modifying CGPA using setter
            student1.setCGPA(7.2);
            System.out.println("Updated CGPA "+student1.getCGPA());
            // Creating a PostgraduateStudent object
            PostgraduateStudent pgStudent=new PostgraduateStudent(201,"Aksh",9.0,"AI/ML");
            pgStudent.displayStudentDetails();
        }
    }
