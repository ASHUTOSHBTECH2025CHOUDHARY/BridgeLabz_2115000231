// Exception propagation example
public class Propogation {
    // Throws exception
    public static void method1() {
        throw new ArithmeticException("Division by zero");
    }

    // Calls method1
    public static void method2() {
        method1();
    }
    // Handles exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main.");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}

