package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.List;

public class CSVJson {
    public static void main(String[] args) {
        String jsonFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\student.json";
        String csvFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students.csv";
        String outputJson = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students_output.json";
        jsonToCsv(jsonFile, csvFile);
        csvToJson(csvFile, outputJson);
    }
    public static void jsonToCsv(String jsonPath, String csvPath) {
        try (FileReader reader = new FileReader(jsonPath);
             CSVWriter writer = new CSVWriter(new FileWriter(csvPath))) {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(reader);
            ArrayNode students = (ArrayNode) root.get("students");
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});
            for (JsonNode student : students) {
                String[] data = {
                        student.get("id").asText(),
                        student.get("name").asText(),
                        student.get("age").asText(),
                        student.get("marks").asText()
                };
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void csvToJson(String csvPath, String jsonPath) {
        try (CSVReader reader = new CSVReader(new FileReader(csvPath));
             FileWriter writer = new FileWriter(jsonPath)) {
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode studentsArray = mapper.createArrayNode();
            List<String[]> rows;
            try {
                rows = reader.readAll();
                for (int i = 1; i < rows.size(); i++) {
                    String[] row = rows.get(i);
                    JsonNode student = mapper.createObjectNode()
                            .put("id", row[0])
                            .put("name", row[1])
                            .put("age", row[2])
                            .put("marks", row[3]);
                    studentsArray.add(student);
                }
                mapper.writeValue(writer, mapper.createObjectNode().set("students", studentsArray));
            } catch (CsvException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
