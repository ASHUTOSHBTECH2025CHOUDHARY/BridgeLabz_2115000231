import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\data.json"));
            String name = rootNode.get("name").asText();
            String email = rootNode.get("email").asText();
            System.out.println(name);
            System.out.println(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}