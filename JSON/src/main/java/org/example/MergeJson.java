import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json1 = "{ \"name\": \"Ashutosh\", \"email\": \"ashutosh@example.com\" }";
            JsonNode node1 = mapper.readTree(json1);
            String json2 = "{ \"age\": 28, \"city\": \"New York\" }";
            JsonNode node2 = mapper.readTree(json2);
            ObjectNode mergedNode = (ObjectNode) node1;
            mergedNode.putAll((ObjectNode) node2);
            String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode);
            System.out.println(mergedJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
