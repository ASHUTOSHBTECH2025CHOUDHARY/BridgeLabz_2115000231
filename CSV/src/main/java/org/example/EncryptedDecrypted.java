package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;
import java.util.Base64;
import java.util.List;

public class EncryptedDecrypted {
    private static final String AES = "AES";
    private static final SecretKey secretKey = generateKey();

    public static void main(String[] args) {
        String csvFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        String encryptedFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees_encrypted.csv";
        String decryptedFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees_decrypted.csv";

        writeEncryptedCSV(csvFile, encryptedFile);
        readDecryptedCSV(encryptedFile, decryptedFile);
    }
    public static void writeEncryptedCSV(String inputPath, String outputPath) {
        try (CSVReader reader = new CSVReader(new FileReader(inputPath));
             CSVWriter writer = new CSVWriter(new FileWriter(outputPath))) {
            List<String[]> rows = reader.readAll();
            for (int i = 0; i < rows.size(); i++) {
                String[] row = rows.get(i);
                if (row.length < 5) {
                    System.err.println("Skipping invalid row" + String.join(",", row));
                    writer.writeNext(row);
                    continue;
                }
                if (i > 0) {
                    row[3] = encrypt(row[3]);
                    row[4] = encrypt(row[4]);
                }
                writer.writeNext(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readDecryptedCSV(String inputPath, String outputPath) {
        try (CSVReader reader = new CSVReader(new FileReader(inputPath));
             CSVWriter writer = new CSVWriter(new FileWriter(outputPath))) {
            List<String[]> rows = reader.readAll();
            for (int i = 0; i < rows.size(); i++) {
                String[] row = rows.get(i);
                if (row.length < 5) {
                    System.err.println("Skipping invalid row: " + String.join(",", row));
                    writer.writeNext(row);
                    continue;
                }
                if (i > 0) {
                    row[3] = decrypt(row[3]);
                    row[4] = decrypt(row[4]);
                }
                writer.writeNext(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SecretKey generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(AES);
            keyGen.init(128);
            return keyGen.generateKey();
        } catch (Exception e) {
            throw new RuntimeException("Error generating key", e);
        }
    }
    public static String encrypt(String value) {
        try {
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException("Encryption failed", e);
        }
    }
    public static String decrypt(String value) {
        try {
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(value)));
        } catch (Exception e) {
            throw new RuntimeException("Decryption failed", e);
        }
    }
}