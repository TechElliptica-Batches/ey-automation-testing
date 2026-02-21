package tests;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/files/25-01-2026/testdata.txt"));

        for(int i = 0 ; i < allLines.size() ; i++){
            System.out.println(allLines.get(i));
        }


    }
}
