import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String title;

    public CourseType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Evaluation method
    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation for " + getTitle() + ": Written Exam");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation for " + getTitle() + ": Assignments and Projects");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation for " + getTitle() + ": Research Paper and Presentation");
    }
}
class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public void startEvaluation() {
        course.evaluate();
    }

    public String getCourseTitle() {
        return course.getTitle();
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        // Creating courses
        Course<ExamCourse> math = new Course<>(new ExamCourse("Maths"));
        Course<AssignmentCourse> cs = new Course<>(new AssignmentCourse("Science"));
        Course<ResearchCourse> physics = new Course<>(new ResearchCourse("Physics"));

        // List of courses
        List<Course<? extends CourseType>> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(cs);
        courseList.add(physics);

        // Evaluate courses
        for (Course<? extends CourseType> c : courseList) {
            System.out.println("Course: " + c.getCourseTitle());
            c.startEvaluation();
            System.out.println();
        }
    }
}
