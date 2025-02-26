import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonstructre {
    public static boolean isJsonValid(String jsonData) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(jsonData);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    public static void main(String[] args) {
        String sampleJson = "{ \"name\": \"Ashutosh\", \"age\": 22 }";
        System.out.println("Is JSON Valid? " + isJsonValid(sampleJson));
    }
}
