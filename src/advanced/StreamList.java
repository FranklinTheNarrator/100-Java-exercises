package advanced;

import java.util.Arrays;
import java.util.List;

public class StreamList {
    List<Integer> data = Arrays.asList(32,16,412471,25,4,6134,1,8794,4,321,6768,74534212,2,9,35,2,6412,8,61,2,34,5,6);

    public void filterList() {
        List<Integer> oddNums = data.stream().filter(number -> number % 2 == 1).toList();

        System.out.println(oddNums);
    }
}
