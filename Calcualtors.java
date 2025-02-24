    import java.lang.reflect.Method;

    class Calculator {
        private int multiply(int a, int b) {
            return a * b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            try {
                // Create instance
                Calculator calc = new Calculator();
                // Get class object
                Class<?> cls = calc.getClass();
                // Get private method
                Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
                // Allow access to private method
                method.setAccessible(true);
                int result = (int) method.invoke(calc, 5, 4);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }