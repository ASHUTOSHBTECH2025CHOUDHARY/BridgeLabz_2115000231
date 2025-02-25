package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FilterMarks {
    public static void main(String[] args) {
        String dataPath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students.csv";

        try (CSVReader dataReader = new CSVReader(new FileReader(dataPath))) {
            List<String[]> recordsList = dataReader.readAll();
            boolean firstRow = true;
            for (String[] row : recordsList) {
                if (firstRow) {
                    firstRow = false;
                    continue;
                }
                int score = Integer.parseInt(row[3]);
                if (score > 80) {
                    System.out.printf(row[0]+" "+row[1]+" "+ row[2]+" "+ row[3]);
                }
            }
        } catch (IOException | CsvException err) {
            err.printStackTrace();
        }
    }
}