package optional;

import java.util.Optional;

public class OptionalMain {

    static String getStreet(User user) {
        if(user != null) {
            Address address = user.getAddress();
            if(address != null) {
                String street = address.getStreet();
                if(street != null) {
                    return street;
                }
            }
        }
        return "not found";
    }

    static  String getStreetUsingOptional(User user) {
        Optional<User> userOptional = Optional.ofNullable(user);
        String street = userOptional.
                map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not found");

        return street;
    }

    public static void main(String[] args) {
        /* Optional.empty() */
        Optional<Object> empty = Optional.empty();
//        System.out.println(empty);

        /* Optional.of() */
        Optional<String> hello = Optional.of("helllloooooooooo"); // passing null throws NPE ,i.e, of() can never be empty
//        System.out.println(hello);
//        System.out.println(hello.isPresent());
//        System.out.println(hello.get());


        /* Optional.ofNullable() */
//        Optional<String> julley = Optional.ofNullable(null);
        Optional<String> julley = Optional.ofNullable("yooooooooo");
        System.out.println(julley);
        String orElse = julley
                .map(String::toUpperCase)   //Method reference of a given type
                .orElse("byyeeee");

//        System.out.println(orElse);

        /* Reducing boilerplate code */
        User user = new User("Souradeep", new Address("Ramnagar"));
        System.out.println("Boilerplate: " + getStreet(null));
        System.out.println("using Optional: " + getStreetUsingOptional(null));

    }
}
