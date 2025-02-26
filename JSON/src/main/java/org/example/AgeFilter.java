import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AgeFilter {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonProcessor = new ObjectMapper();
            JsonNode userRecords = jsonProcessor.readTree(new File("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\Employeedata.json"));
            List<JsonNode> eligibleUsers = new ArrayList<>();
            for (JsonNode user : userRecords) {
                if (user.get("age").asInt() > 25) {
                    eligibleUsers.add(user);
                }
            }
            String outputJson = jsonProcessor.writerWithDefaultPrettyPrinter().writeValueAsString(eligibleUsers);
            System.out.println(outputJson);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
