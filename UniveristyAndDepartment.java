// Faculty class (can exist independently of a Department - Aggregation)
class Faculty {
    //Instance Variable
    private String name;
    //method to get Faculty
    public Faculty(String name) {
        this.name = name;
    }
    // method to get facultydetils
    public String getFacultyDetails() {
        return "Faculty: " + name;
    }
}

// Department class (part of University - Composition)
class Department {
    private String name;
    private Faculty[] faculties;

    public Department(String name, Faculty[] faculties) {
        this.name = name;
        this.faculties = faculties;
    }
    // Method to get department details
    public String getDepartmentDetails() {
        String result = "Department: " + name + "\n";
        for (Faculty faculty : faculties) {
            result += "\t" + faculty.getFacultyDetails() + "\n";
        }
        return result;
    }
}


class University {
    // Instance Variables
    private String name;
    private Department[] departments;

    public University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }
    // Method to get university details
    public String getUniversityDetails() {
        String result = "University: " + name + "\n";
        for (Department department : departments) {
            result += department.getDepartmentDetails() + "\n";
        }
        return result;
    }
}

public class UniveristyAndDepartment {
    public static void main(String[] args) {
        // Create Faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        // Create Departments with Faculty members
        Department department1 = new Department("Computer Science", new Faculty[]{faculty1});
        Department department2 = new Department("Mathematics", new Faculty[]{faculty2});

        // Create a University with Departments
        University university = new University("Tech University", new Department[]{department1, department2});

        System.out.println(university.getUniversityDetails());

        // Delete the University
        university = null;

        // Show that Faculty members still exist
        System.out.println("Faculty members after University deletion:");
        System.out.println(faculty1.getFacultyDetails());
        System.out.println(faculty2.getFacultyDetails());
    }
}

