package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public void readFile(String path) {
        try {
            File inputData = new File(path);
            Scanner scanLine = new Scanner(inputData);

            System.out.println("Content of " + path + ":");
            while (scanLine.hasNextLine()) {
                String line = scanLine.nextLine();
                System.out.println(line);
            }

            scanLine.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
