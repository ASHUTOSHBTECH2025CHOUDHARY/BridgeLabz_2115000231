import org.json.JSONObject;


public class CreateJson {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alice");
        jsonObject.put("age", 25);
        jsonObject.put("email", "alice@example.com");
        System.out.println(jsonObject.toString());
    }
}
