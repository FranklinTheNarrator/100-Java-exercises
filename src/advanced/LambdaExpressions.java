package advanced;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    List<String> data = Arrays.asList("House", "Loop", "advance", "space", "Exercise", "Book", "english", "Engine");

    public void applyLambda() {
        data.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.println(data);
    }
}
