import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}
class User {
    @JsonField(name = "user_name")
    private String username;
    @JsonField(name = "user_email")
    private String email;
    private int age;
    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public String toJson() {
        Map<String, String> jsonMap = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    String key = field.getAnnotation(JsonField.class).name();
                    String value = field.get(this).toString();
                    jsonMap.put(key, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }
        if (jsonString.length() > 1) {
            jsonString.setLength(jsonString.length() - 2);
        }
        jsonString.append("}");
        return jsonString.toString();
    }
}

public class JSON {
    public static void main(String[] args) {
        User user = new User("Ashutosh", "ashu@example.com", 25);
        String jsonOutput = user.toJson();
        System.out.println(jsonOutput);
    }
}
