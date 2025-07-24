import fileIO.LineCounter;

public class Main {
    public static void main(String[] args) {
        String originalData = "src\\fileIO\\res\\data.txt";
        String outputData = "src\\fileIO\\res\\outputData.txt";

        LineCounter lineCounter = new LineCounter();
        lineCounter.countLines(originalData);
    }
}