package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";

        try (CSVReader fileReader = new CSVReader(new FileReader(filePath));
             Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter Employee Name: ");
            String targetName = userInput.nextLine().trim();
            List<String[]> dataRecords = fileReader.readAll();
            boolean ignoreHeader = true;
            boolean recordFound = false;
            for (String[] entry : dataRecords) {
                if (ignoreHeader) {
                    ignoreHeader = false;
                    continue;
                }
                if (entry[1].equalsIgnoreCase(targetName)) {
                    System.out.printf(entry[2], entry[3]);
                    recordFound = true;
                    break;
                }
            }
            if (!recordFound) {
                System.out.println("No matching record found.");
            }
        } catch (IOException | CsvException error) {
            error.printStackTrace();
        }
    }
}
