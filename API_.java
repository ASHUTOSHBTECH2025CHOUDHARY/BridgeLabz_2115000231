import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "initial_key";
}

public class API_ {
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            System.out.println("Original API_KEY: " + apiKeyField.get(null));
            apiKeyField.set(null, "new_key");
            System.out.println("Updated API_KEY: " + apiKeyField.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}