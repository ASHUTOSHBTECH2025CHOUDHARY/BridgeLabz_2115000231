import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVtoJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonHandler = new ObjectMapper();
            ArrayNode jsonArray = jsonHandler.createArrayNode();
            CSVReader fileReader = new CSVReader(new FileReader("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\file2.json"));
            List<String[]> csvData = fileReader.readAll();
            fileReader.close();
            if (csvData.isEmpty()) {
                System.out.println("file has no content.");
                return;
            }
            String[] headers = csvData.get(0);
            for (int i = 1; i < csvData.size(); i++) {
                ObjectNode jsonObject = jsonHandler.createObjectNode();
                for (int j = 0; j < headers.length; j++) {
                    jsonObject.put(headers[j], csvData.get(i)[j]);
                }
                jsonArray.add(jsonObject);
            }
            String finalJson = jsonHandler.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
            System.out.println(finalJson);
        } catch (IOException | CsvException error) {
            error.printStackTrace();
        }
    }
}
