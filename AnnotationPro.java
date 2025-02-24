import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
class Operations {
    @ImportantMethod(level = "CRITICAL")
    public void processData() {
        System.out.println("Processing data...");
    }
    @ImportantMethod
    public void generateReport() {
        System.out.println("Generating report...");
    }
    public void helperFunction() {
        System.out.println("This method is not marked as important.");
    }
}

public class AnnotationPro {
    public static void main(String[] args) {
        // Get class reference
        Class<?> operationsClass = Operations.class;
        Method[] methods = operationsClass.getDeclaredMethods();
        System.out.println("Important Methods:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " " + annotation.level());
            }
        }
    }
}

