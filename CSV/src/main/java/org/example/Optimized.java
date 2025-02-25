package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Optimized {
    public static void main(String[] args) {
        String csvPath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        int batchSize = 100;
        int totalProcessed = 0;
        try (CSVReader reader = new CSVReader(new FileReader(csvPath))) {
            List<String[]> records = reader.readAll();
            boolean isHeader = true;

            for (int i = 0; i < records.size(); i++) {
                if (isHeader) {
                    isHeader = false; // Skip header
                    continue;
                }

                if (i % batchSize == 0 && i != 0) {
                    System.out.println(i);
                }
                totalProcessed++;
            }

            System.out.println(totalProcessed);

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
