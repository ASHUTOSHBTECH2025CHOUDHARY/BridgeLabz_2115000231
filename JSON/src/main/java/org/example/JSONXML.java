import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
import java.io.File;
import java.io.IOException;

public class JSONXML {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonProcessor = new ObjectMapper();
            JsonNode jsonData = jsonProcessor.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\file1.json"));
            JSONObject jsonObject = new JSONObject(jsonData.toString());
            String xmlOutput = XML.toString(jsonObject);
            System.out.println( xmlOutput);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
