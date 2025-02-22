import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Divide {
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by 0");
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(20, 4));
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

class DivideExceptionTest {
    @Test
    void testingDivide() {
        assertEquals(5, Divide.divide(10, 2));
    }

    @Test
    void testingDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Divide.divide(5, 0));
    }
}
