package Reflections;

import java.util.*;
import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicInvocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine().trim();

            // Take input numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get MathOperations class reference and create an instance
            Class<?> mathOpsClass = MathOperations.class;
            Object instance = mathOpsClass.getDeclaredConstructor().newInstance();

            // Fetch method dynamically
            Method method = mathOpsClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            int result = (int) method.invoke(instance, num1, num2);
            System.out.println("Result: " + result);
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Invalid method name.");
        } catch (Exception e) {
            System.out.println("An error occurred during execution.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
