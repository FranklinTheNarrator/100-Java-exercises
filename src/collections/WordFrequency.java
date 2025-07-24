package collections;

import java.util.HashMap;

public class WordFrequency {
    HashMap<String, Integer> frequencyList = new HashMap<>();
    String data = "Hello, my name is.John! hello name name!   ! hello";

    public void countFrequency() {
        int frequency = 0;

        String[] wordArray = data.split("[,.!\\s]+");

        for (int a = 0; a < wordArray.length; a++) {
            for (int b = 0; b < wordArray.length; b++) {
                if (wordArray[a].equals(wordArray[b])) {
                    frequency++;
                }
            }

            frequencyList.put(wordArray[a], frequency);
            frequency = 0;
        }

        System.out.println(frequencyList);
    }
}
