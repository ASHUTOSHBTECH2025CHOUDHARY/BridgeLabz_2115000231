import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Student {
    private String studentName;
    private int studentAge;
    private String studentEmail;
    public Student(String studentName, int studentAge, String studentEmail) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
    }
    public String getStudentName() { return studentName; }
    public int getStudentAge() { return studentAge; }
    public String getStudentEmail() { return studentEmail; }
}

public class ConvertJsonJava {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Student> students = Arrays.asList(
                    new Student("Ashutosh", 25, "ashutosh1@example.com"),
                    new Student("Ashutosh", 30, "ashutosh2@example.com"),
                    new Student("Ashutosh", 28, "ashutosh3@example.com")
            );
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
