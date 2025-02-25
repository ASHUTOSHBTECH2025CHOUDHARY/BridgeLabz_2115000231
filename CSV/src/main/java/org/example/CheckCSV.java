package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.*;

public class CheckCSV {
    public static void main(String[] args) {
        String path = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        String email_rule = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phone_rule = "^[0-9]{10}$";
        Pattern email_chk = Pattern.compile(email_rule);
        Pattern phone_chk = Pattern.compile(phone_rule);
        try (CSVReader rd = new CSVReader(new FileReader(path))) {
            List<String[]> info = rd.readAll();
            boolean hdr = true;
            for (String[] row : info) {
                if (hdr) {
                    hdr = false;
                    continue;
                }
                Matcher mail_match = email_chk.matcher(row[2]);
                Matcher phone_match = phone_chk.matcher(row[3]);
                if (!mail_match.matches()) {
                    System.out.println(row[2] + " " + String.join(", ", row));
                }
                if (!phone_match.matches()) {
                    System.out.println(row[3] + " " + String.join(", ", row));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
