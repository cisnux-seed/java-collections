package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;

import java.util.*;

public class ImmutableListApp {
    public static void main(String[] args) {
        final List<String> hobbies = new ArrayList<>();
        hobbies.add("foody");
        hobbies.add("gamer");
        final var person = new ImmutablePerson("fajra", hobbies);
        System.out.println(person.hobbies());
//        doSomethingWithHobbies(person.hobbies()); // [foody, gamer]
        // now it's safe
//        System.out.println(person.hobbies()); // throw UnsupportedOperationException
        final var emptyHobbies = Collections.<String>emptyList();
        final var singleHobby = Collections.singletonList("gamer");
        final var unmodifiedList = Collections.unmodifiableList(hobbies);
        final var immutableHobbies = List.of("foody","gamer");
        final var arrayImmutableHobbies = Arrays.asList("foody","gamer");

        System.out.println(emptyHobbies);
        System.out.println(singleHobby);
        System.out.println(unmodifiedList);
        System.out.println(immutableHobbies);
        System.out.println(arrayImmutableHobbies);
//        doSomethingWithHobbies(unmodifiedList); // throw UnsupportedOperationException
    }

    private static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("invalid");
    }
}
