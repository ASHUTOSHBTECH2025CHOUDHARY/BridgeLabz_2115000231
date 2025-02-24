import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugList.class)
@interface BugReport {
    String issue();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugList {
    BugReport[] value();
}

class Application {
    @BugReport(issue = "Handles null values incorrectly")
    @BugReport(issue = "Causes delay with large datasets")
    public void executeTask() {
        System.out.println("Executing task...");
    }
}

public class Bugs {
    public static void main(String[] args) {
        try {
            Method method = Application.class.getMethod("executeTask");

            if (method.isAnnotationPresent(BugList.class)) {
                BugList bugList = method.getAnnotation(BugList.class);
                for (BugReport bug : bugList.value()) {
                    System.out.println("Issue: " + bug.issue());
                }
            }

            new Application().executeTask();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

