import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}
class Service {
    void perform() {
        System.out.println("Service is executing");
    }
}
class Client {
    @Inject
    private Service service;

    void execute() {
        if (service != null) {
            service.perform();
        } else {
            System.out.println("Dependency");
        }
    }
}
class DIContainer {
    static void injectDependencies(Object obj) {
        try {
            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Class<?> dependencyType = field.getType();
                    Object dependencyInstance = dependencyType.getDeclaredConstructor().newInstance();
                    field.setAccessible(true);
                    field.set(obj, dependencyInstance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DependencyInj {
    public static void main(String[] args) {
        Client client = new Client();
        DIContainer.injectDependencies(client);
        client.execute();
    }
}
