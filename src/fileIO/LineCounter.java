package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public void countLines(String path) {
        try {
            int counter = 0;

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            while (bufferedReader.readLine() != null) {
                counter++;
            }

            System.out.println(counter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
