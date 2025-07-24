package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListIntersection {
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();

    public static void setLists() {
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20 + 1));
            list2.add((int) (Math.random() * 20 + 1));
        }
        System.out.println("Original 1: " + list1);
        System.out.println("Original 2: " + list2);
    }

    public void findIntersection() {
        setLists();

        for (int i = 0; i < list1.size(); i++) {
            for (int a = 0; a < list2.size(); a++) {
                if (Objects.equals(list1.get(i), list2.get(a))) {
                    System.out.println("Intersection! -> " + list1.get(i));
                }
            }
        }
    }
}
