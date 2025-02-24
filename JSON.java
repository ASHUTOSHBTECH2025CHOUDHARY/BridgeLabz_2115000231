import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Define the custom annotation for JSON field mapping
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonProperty {
    String key();
}

class UserAccount {
    @JsonProperty(key = "username")
    private String name;
    @JsonProperty(key = "age")
    private int yearsOld;
    @JsonProperty(key = "email_address")
    private String email;
    public UserAccount(String name, int yearsOld, String email) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.email = email;
    }
}
class ObjectToJsonConverter {
    public static String convertToJson(Object obj) {
        try {
            Class<?> objClass = obj.getClass();
            Map<String, String> jsonKeyValuePairs = new LinkedHashMap<>();
            for (Field field : objClass.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonProperty.class)) {
                    String jsonKey = field.getAnnotation(JsonProperty.class).key();
                    Object value = field.get(obj);
                    jsonKeyValuePairs.put(jsonKey, String.valueOf(value));
                }
            }
            StringBuilder jsonString = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonKeyValuePairs.entrySet()) {
                jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
            }
            if (jsonString.length() > 1) {
                jsonString.delete(jsonString.length() - 2, jsonString.length());
            }
            jsonString.append("}");
            return jsonString.toString();
        } catch (Exception e) {
            return "Serialization error: " + e.getMessage();
        }
    }
}
public class Json {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Ashu", 23, "ashu@example.com");
        String jsonOutput = ObjectToJsonConverter.convertToJson(user);
        System.out.println(jsonOutput);
    }
}

