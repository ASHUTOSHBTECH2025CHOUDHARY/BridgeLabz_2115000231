import java.lang.reflect.Method;
import java.util.Scanner;

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
        try {
            MathOperations mathObj = new MathOperations();
            Class<?> mathClass = mathObj.getClass();
            Scanner scanner = new Scanner(System.in);
            String methodName = scanner.next();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            Method method = mathClass.getMethod(methodName, int.class, int.class);
            Object result = method.invoke(mathObj, num1, num2);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

