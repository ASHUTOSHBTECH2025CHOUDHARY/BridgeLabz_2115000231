package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class RowCounter {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";

        try (CSVReader fileReader = new CSVReader(new FileReader(sourceFile))) {
            List<String[]> content = fileReader.readAll();
            int totalEntries = content.size() > 0 ? content.size() - 1 : 0;
            System.out.println("Entries Count: " + totalEntries);
        } catch (IOException | CsvException error) {
            error.printStackTrace();
        }
    }
}
