import java.lang.reflect.Method;
class SampleOperations {
    public void fastMethod() {
        System.out.println("Executing fast method");
    }

    public void slowMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();
            long executionTime = (endTime - startTime) / 1_000_000;
            System.out.println(methodName + " " + executionTime );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MethodExecution {
    public static void main(String[] args) {
        SampleOperations operations = new SampleOperations();
        MethodTimer.measureExecutionTime(operations, "fastMethod");
        MethodTimer.measureExecutionTime(operations, "slowMethod");
    }
}

