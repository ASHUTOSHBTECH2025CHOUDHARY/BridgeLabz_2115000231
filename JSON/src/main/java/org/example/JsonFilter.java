import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class JsonFilter {
    public static void main(String[] args) {
        String jsonArray = "[{\"name\":\"Ashutosh\",\"age\":25,\"email\":\"ashutosh1@example.com\"}," +
                "{\"name\":\"Rahul\",\"age\":30,\"email\":\"rahul@example.com\"}," +
                "{\"name\":\"Vikram\",\"age\":28,\"email\":\"vikram@example.com\"}]";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonArray);
            List<JsonNode> filteredList = new ArrayList<>();
            for (JsonNode node : jsonNode) {
                if (node.get("age").asInt() > 25) {
                    filteredList.add(node);
                }
            }
            String filteredJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredList);
            System.out.println(filteredJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
