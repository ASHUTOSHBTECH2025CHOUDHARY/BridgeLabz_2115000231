import java.lang.reflect.*;
import java.util.Scanner;

public class ClassViewer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        try {
            // Loading the class dynamically
            Class<?> clazz = Class.forName(className);
            // Display class name
            System.out.println(clazz.getName());
            // Display constructors
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
            // Display fields
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }
            // Display methods
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println(className);
        }
    }
}