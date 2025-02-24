import java.lang.reflect.Method;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Invoking method: sayHello");
        System.out.println("Hello");
    }
}
public class LoggingExm {
    public static void main(String[] args) {
        try {
            Greeting greeting = new GreetingImpl();
            Class<?> clazz = greeting.getClass();
            Method method = clazz.getMethod("sayHello");
            method.invoke(greeting);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
