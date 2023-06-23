package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //Using Path and File classes
        String fileName = "/Users/mabookpro/Desktop/First11.txt";
        String fileInfo;
        try{
            Path filePath = Paths.get(fileName);
            byte[] fileData = Files.readAllBytes(filePath);
            fileInfo = new String(fileData);

        } catch (IOException e) {
            throw new RuntimeException("Unable to read file data" + e.getMessage());
        }
        System.out.println(fileInfo);
    }
}