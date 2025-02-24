import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class DynamicObject{
    public static void main(String[] args) {
        try {
            // Get the Class object of Student
            Class<?> studentClass = Class.forName("Student");
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
            Object studentInstance = constructor.newInstance("Ashutosh", 101);
            studentClass.getMethod("displayInfo").invoke(studentInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

