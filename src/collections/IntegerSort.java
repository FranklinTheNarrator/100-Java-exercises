package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSort {
    List<Integer> list = new ArrayList<>();

    public void sortList() {
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 500));
        }
        System.out.println("Original: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}
