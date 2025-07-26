package advanced.optional;

import java.util.Optional;

public class OptionalExample {
    String name = "foo";
    Optional<String> stringExample = Optional.of(name);

    Integer age = null;
    Optional<Integer> integerExample= Optional.ofNullable(age);

    public void optional() {
        System.out.println("Optional of name: " + stringExample);
        System.out.println("Optional of age: " + integerExample);
    }
}
