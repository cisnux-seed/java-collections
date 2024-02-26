package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;

import java.util.*;


public class ImmutableMapApp {
    public static void main(String[] args) {
        final Map<String, String> name = Map.<String, String>of(
                "firstName", "Fajra",
                "middleName", "Cisnux",
                "lastName", "Risqulla"
        );
        System.out.println(name);
        final var emptyNames = Collections.<String, String>emptyMap();
        final var singletonName = Collections.<String, String>singletonMap("firstName", "Fajra");
        System.out.println(singletonName);
//        singletonName.put("aaa","ccc"); // throw error
//        name.put("otherName", "test"); // throw error
        final Map<String, ImmutablePerson> persons = new HashMap<>();
        persons.put("person1", new ImmutablePerson("Fajra", List.of("programming", "gaming")));
        persons.put("person2", new ImmutablePerson("Cisnux", List.of("foody")));
        System.out.println(persons);
        final var immutablePersons = Collections.unmodifiableMap(persons);
        // throwing error
//        immutablePersons.put("person3", new ImmutablePerson("Risqulla", List.of("foody", "programming")));
        System.out.println(immutablePersons);
    }
}
