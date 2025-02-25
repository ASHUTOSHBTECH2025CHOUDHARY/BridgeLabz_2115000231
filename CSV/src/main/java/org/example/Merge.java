package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        String pathOne = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students1.csv";
        String pathTwo = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students2.csv";
        String outputFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students_merged.csv";
        Map<String, String[]> recordsMap = new HashMap<>();
        List<String[]> finalRecords = new ArrayList<>();
        try (CSVReader readerOne = new CSVReader(new FileReader(pathOne));
             CSVReader readerTwo = new CSVReader(new FileReader(pathTwo));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            List<String[]> listOne = readerOne.readAll();
            List<String[]> listTwo = readerTwo.readAll();
            finalRecords.add(new String[]{"ID", "FullName", "Age", "Score", "Grade"});
            boolean skipHeaderOne = true, skipHeaderTwo = true;
            for (String[] row : listOne) {
                if (skipHeaderOne) {
                    skipHeaderOne = false;
                    continue;
                }
                recordsMap.put(row[0], row);
            }
            for (String[] row : listTwo) {
                if (skipHeaderTwo) {
                    skipHeaderTwo = false;
                    continue;
                }
                if (recordsMap.containsKey(row[0])) {
                    String[] studentInfo = recordsMap.get(row[0]);
                    String[] mergedRow = {studentInfo[0], studentInfo[1], studentInfo[2], row[1], row[2]};
                    finalRecords.add(mergedRow);
                }
            }
            writer.writeAll(finalRecords);
            System.out.println(outputFile);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}