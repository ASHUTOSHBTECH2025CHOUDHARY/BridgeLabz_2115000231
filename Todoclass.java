import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String description();
    String assignedDeveloper();
    String urgency() default "MEDIUM";
}
class DevelopmentModule {
    @Todo(description = "Integrate authentication system", assignedDeveloper = "Ashutosh", urgency = "HIGH")
    @Todo(description = "Enhance database performance", assignedDeveloper = "ashutosh")
    public void buildFeature() {
        System.out.println("Developing feature");
    }
    @Todo(description = "Revamp UI for better usability", assignedDeveloper = "Lmma", urgency = "LOW")
    public void redesignUI() {
        System.out.println("Updating UI");
    }
}
public class Todoclass {
    public static void main(String[] args) {
        try {
            Class<DevelopmentModule> devClass = DevelopmentModule.class;
            for (Method method : devClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Pending Task " + todo.description());
                    System.out.println("Assigned Developer " + todo.assignedDeveloper());
                    System.out.println("Urgency " + todo.urgency());
                }
            }
            new DevelopmentModule().buildFeature();
            new DevelopmentModule().redesignUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}