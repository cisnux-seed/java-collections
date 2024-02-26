package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;
import dev.cisnux.collections.PersonComparator;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        final SortedSet<ImmutablePerson> peoples = new TreeSet<>(new PersonComparator());
        peoples.add(new ImmutablePerson("Fajra", List.of("game")));
        peoples.add(new ImmutablePerson("Risqulla", List.of("music", "write")));
        peoples.add(new ImmutablePerson("Cisnux", List.of("music", "read")));

        System.out.println(peoples);
    }
}
