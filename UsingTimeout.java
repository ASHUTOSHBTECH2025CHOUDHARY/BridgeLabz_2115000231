import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

public class UsingTimeout {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulate a long-running task
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(longRunningTask());
        System.out.println("End");
    }
}

class UsingTimeoutTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testingLongRunningTask() {
        assertEquals("Task Completed", PerformanceTesting.longRunningTask());
    }
}
