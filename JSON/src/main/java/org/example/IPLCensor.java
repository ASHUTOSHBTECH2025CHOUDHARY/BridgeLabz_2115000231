import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.Arrays;

public class IPLCensor {
    private static String maskTeamName(String team) {
        return team.split(" ")[0] + " ***";
    }
    private static void processJson(String inf, String ofi) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File(inf));
        ArrayNode modifiedArray = mapper.createArrayNode();

        for (JsonNode match : root) {
            ObjectNode modifiedMatch = ((ObjectNode) match);
            modifiedMatch.put("team1", maskTeamName(match.get("team1").asText()));
            modifiedMatch.put("team2", maskTeamName(match.get("team2").asText()));
            modifiedMatch.put("player_of_match", "REDACTED");
            modifiedArray.add(modifiedMatch);
        }
        mapper.writeValue(new File(ofi), modifiedArray);
    }
    private static void processCsv(String inf, String ofi) throws IOException, CsvValidationException {
        try (CSVReader reader = new CSVReader(new FileReader(inf));
             CSVWriter writer = new CSVWriter(new FileWriter(ofi))) {
            String[] headers = reader.readNext();
            writer.writeNext(headers);
            String[] row;
            while ((row = reader.readNext()) != null) {
                row[1] = maskTeamName(row[1]);
                row[2] = maskTeamName(row[2]);
                row[6] = "REDACTED";
                writer.writeNext(row);
            }
        }
    }

    public static void main(String[] args) {
        try {
            processJson("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\ipldata1.json", "C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\ipldata2.json");
            processCsv("C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\ipldata1.csv", "C:\\Users\\ashut\\Documents\\JSON\\src\\main\\java\\org\\example\\ipldata2.csv");
            System.out.println("Censorship applied successfully.");
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
