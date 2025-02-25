package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        Map<String, List<String[]>> dataMap = new HashMap<>();
        boolean skipHeader = true;
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = csvReader.readAll();
            for (String[] row : rows) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }
                String key = row[0];
                dataMap.putIfAbsent(key, new ArrayList<>());
                dataMap.get(key).add(row);
            }
            for (Map.Entry<String, List<String[]>> entry : dataMap.entrySet()) {
                if (entry.getValue().size() > 1) {
                    for (String[] duplicate : entry.getValue()) {
                        System.out.println(Arrays.toString(duplicate));
                    }
                }
            }

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
