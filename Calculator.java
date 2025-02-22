import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to subtract one integer from another
    public int subtract(int a, int b) {
        return a - b;
    }
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    // Method to divide one integer by another
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by 0");
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.subtract(10, 4));
        System.out.println(calc.multiply(6, 2));
        System.out.println(calc.divide(9, 3));
    }
}

class TestingCalculator {
    Calculator calc = new Calculator();
    @Test
    void testingAdd() {
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    void testingSubtract() {
        assertEquals(1, calc.subtract(4, 3));
    }
    @Test
    void testingMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }
    @Test
    void testingDivide() {
        assertEquals(2, calc.divide(6, 3));
    }
    @Test
    void testingDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}