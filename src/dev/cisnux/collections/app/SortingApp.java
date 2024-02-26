package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<ImmutablePerson> persons = new ArrayList<>(List.of(
                new ImmutablePerson("Risqulla", List.of("foody", "gamer")),
                new ImmutablePerson("Cisnux", List.of("foody", "gamer")),
                new ImmutablePerson("Fajra", List.of("gamer")))
        );
        List<String> names = new ArrayList<>(List.of("Risqulla", "Cisnux", "Fajra"));
        System.out.println(names);
        System.out.println(persons);
        persons.sort(Comparator.comparing(ImmutablePerson::name));
        Collections.sort(names);
        System.out.println(persons);
        System.out.println(names);
    }
}
