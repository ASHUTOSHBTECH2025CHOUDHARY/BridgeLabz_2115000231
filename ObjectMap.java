import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMap {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(instance, value);
                } catch (NoSuchFieldException e) {
                    System.err.println(fieldName);
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create object", e);
        }
    }
    public static void main(String[] args) {

        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30,
                "email", "john.doe@example.com"
        );
        Person person = toObject(Person.class, properties);
        System.out.println(person);
    }
}
class Person {
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
