import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
class ExecutionTimer {
    public static void executeWithTiming(Object obj, Method method, Object... args) throws Exception {
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime();
            method.invoke(obj, args);
            long endTime = System.nanoTime();
            System.out.println(method.getName() + " " + (endTime - startTime));
        } else {
            method.invoke(obj, args);
        }
    }
}

class TaskHandler {
    @LogExecutionTime
    public void processData() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processing data");
    }

    @LogExecutionTime
    public void fetchData() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fetching data");
    }
    public void normalMethod() {
        System.out.println("This method is not logged.");
    }
}

public class ExecutionTime {
    public static void main(String[] args) throws Exception {
        TaskHandler taskHandler = new TaskHandler();
        Class<?> taskClass = taskHandler.getClass();
        for (Method method : taskClass.getDeclaredMethods()) {
            ExecutionTimer.executeWithTiming(taskHandler, method);
        }
    }
}
