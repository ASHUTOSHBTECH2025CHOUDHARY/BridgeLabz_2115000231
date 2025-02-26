import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonReader {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonParser = new ObjectMapper();
            JsonNode root = jsonParser.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\data.json"));
            displayJson(root, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void displayJson(JsonNode node, String space) {
        if (node.isObject()) {
            node.fields().forEachRemaining(entry -> {
                System.out.println(space + entry.getKey() + " :");
                displayJson(entry.getValue(), space + "  ");
            });
        } else if (node.isArray()) {
            for (JsonNode item : node) {
                displayJson(item, space + "  ");
            }
        } else {
            System.out.println(space + node.asText());
        }
    }
}
