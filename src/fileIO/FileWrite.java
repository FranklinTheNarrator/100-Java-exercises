package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public void writeFile(String path) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(path)) {
            String userInput = scanner.nextLine();
            writer.write(userInput);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
