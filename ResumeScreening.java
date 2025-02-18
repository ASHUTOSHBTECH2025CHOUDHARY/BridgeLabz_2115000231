import java.util.Arrays;
import java.util.List;

abstract class JobRole {
    abstract void analyzeResume();
}

class SoftwareEngineer extends JobRole {
    @Override
    public void analyzeResume() {
        System.out.println("Evaluating resume for Software Engineer");
    }
}

class DataScientist extends JobRole {
    @Override
    public void analyzeResume() {
        System.out.println("Evaluating resume for Data Scientist");
    }
}

class ProductManager extends JobRole {
    @Override
    public void analyzeResume() {
        System.out.println("Evaluating resume for Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public void evaluateResume() {
        role.analyzeResume();
    }
}

class ResumeScreeningSystem {
    public static void analyzeResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.analyzeResume();
            System.out.println();
        }
    }
}

public class ResumeScreening {
    public static void main(String[] args) {
        // List of job roles
        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );

        // Process resumes dynamically
        ResumeScreeningSystem.analyzeResumes(roles);
    }
}
