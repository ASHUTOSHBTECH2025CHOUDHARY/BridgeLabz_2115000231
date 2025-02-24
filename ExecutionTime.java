import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom annotation to log execution time
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TrackExecutionTime {
}
class PerformanceMonitor {
    @TrackExecutionTime
    public void analyzeData() {
        System.out.println("Analyzing data");
        try {
            Thread.sleep(450); // Simulating processing delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    @TrackExecutionTime
    public void retrieveRecords() {
        System.out.println("Retrieving records from storage");
        try {
            Thread.sleep(280);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ExecutionTime {
    public static void main(String[] args) {
        try {
            PerformanceMonitor monitor = new PerformanceMonitor();
            Method[] methodList = PerformanceMonitor.class.getDeclaredMethods();
            for (Method method : methodList) {
                if (method.isAnnotationPresent(TrackExecutionTime.class)) {
                    long startTimestamp = System.nanoTime();
                    method.invoke(monitor); // Dynamically executing the method
                    long endTimestamp = System.nanoTime();
                    long elapsedTime = (endTimestamp - startTimestamp) / 1_000_000;
                    System.out.println("Execution time for " + method.getName() + ": " + elapsedTime + " ms");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

