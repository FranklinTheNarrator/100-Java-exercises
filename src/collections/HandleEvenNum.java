package collections;

import java.util.ArrayList;
import java.util.List;

public class HandleEvenNum {
    List<Integer> data = new ArrayList<>();

    public void removeEven() {
        for (int i = 0; i < 10; i++) {
            data.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Original: " + data);

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 == 0) {
                data.remove(i);
                i--;
            }
        }

        System.out.println("Modified: " + data);
    }
}
