package optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        /* Optional.empty() */
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        /* Optional.of() */
        Optional<String> hello = Optional.of("helllloooooooooo"); // passing null throws NPE ,i.e, of() can never be empty
        System.out.println(hello);
        System.out.println(hello.isPresent());


        /* Optional.ofNullable() */
        Optional<String> julley = Optional.ofNullable("helloooo");
        System.out.println(julley);
        String orElse = julley
                .map(String::toUpperCase)   //Method reference of a given type
                .orElse("byyeeee");

        System.out.println(orElse);

    }
}
