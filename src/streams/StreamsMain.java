package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        /* IMPERATIVE APPROACH */
        List<Person> females = new ArrayList<>();
        for(Person person : people) {
            if(person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
//        females.forEach(System.out::println);

        /* DECLARATIVE APPROACH */
        // filter
//        System.out.println("------- USING FILTER --------");
        List<Person> females1 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females1.forEach(System.out::println);

        // sort
        System.out.println("------ SORTING -------");
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge))
                .limit(3)
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

        // allMatch
        System.out.println("----- ALL MATCH -------");
        Boolean allMatching = people.stream()
                .allMatch(person -> person.getAge() > 20);
        System.out.println(allMatching);

        // anyMatch
        System.out.println("----- ANY MATCH -------");
        Boolean anyMatching = people.stream()
                .anyMatch(person -> person.getAge() > 100);
        System.out.println(anyMatching);

        // anyMatch
        System.out.println("----- NONE MATCH -------");
        Boolean noneMatching = people.stream()
                .noneMatch(person -> person.getName().contains("abc"));
        System.out.println(noneMatching);

        // max
        System.out.println("------- MAX ------");
        Optional<Person> maxAge = people.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(maxAge);
        System.out.println(maxAge.get());

        // min
        System.out.println("------- MIN ------");
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // grouping
        System.out.println("------ GROUPING -------");
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        }));

        // oldest female in the list
        System.out.println("---- OLDEST FEMALE IN THE LIST -----");
        Optional<String> oldestFemaleName = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);
                .map(Person::getName);

        oldestFemaleName.ifPresent(System.out::println);
    }

    private static  List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 57, Gender.FEMALE),
                new Person("Helen White", 33, Gender.OTHERS),
                new Person("Alex Boz", 14, Gender.OTHERS),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Ana Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
