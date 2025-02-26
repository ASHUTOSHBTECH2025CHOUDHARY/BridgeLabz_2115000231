import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

public class JsonMerger {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonHandler = new ObjectMapper();
            JsonNode jsonData1 = jsonHandler.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\file1.json"));
            JsonNode jsonData2 = jsonHandler.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\file2.json"));

            ObjectNode combinedJson = jsonHandler.createObjectNode();
            combinedJson.setAll((ObjectNode) jsonData1);
            combinedJson.setAll((ObjectNode) jsonData2);

            String resultJson = jsonHandler.writerWithDefaultPrettyPrinter().writeValueAsString(combinedJson);
            System.out.println(resultJson);

            jsonHandler.writeValue(new File("finalMerged.json"), combinedJson);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
