package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public void appendContent(String inputData, String outputData) {
        try (FileWriter writer = new FileWriter(outputData, true)) {
            File data = new File(inputData);
            Scanner scanLine = new Scanner(data);

            while (scanLine.hasNextLine()) {
                String line = scanLine.nextLine();
                writer.write(line);
            }

            scanLine.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
