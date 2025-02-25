import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        String sourceFile = "New folder/Employee.csv";
        String reportFile = "employee_summary.csv";
        try (CSVReader csvReader = new CSVReader(new FileReader(sourceFile));
             CSVWriter csvWriter = new CSVWriter(new FileWriter(reportFile))) {
            List<String[]> dataRecords = csvReader.readAll();
            if (dataRecords.isEmpty()) {
                System.out.println("Error: CSV file is empty.");
                return;
            }
            csvWriter.writeNext(dataRecords.get(0));
            for (int rowIndex = 1; rowIndex < dataRecords.size(); rowIndex++) {
                csvWriter.writeNext(dataRecords.get(rowIndex));
            }
            System.out.println("CSV report successfully created!");
        } catch (IOException | CsvException error) {
            error.printStackTrace();
        }
    }
}

