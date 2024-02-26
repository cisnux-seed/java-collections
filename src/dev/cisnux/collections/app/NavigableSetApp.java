package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;
import dev.cisnux.collections.PersonComparator;

import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        final NavigableSet<ImmutablePerson> peoples = new TreeSet<>(new PersonComparator());
        peoples.add(new ImmutablePerson("Fajra", List.of("game")));
        peoples.add(new ImmutablePerson("Risqulla", List.of("music", "write")));
        peoples.add(new ImmutablePerson("Cisnux", List.of("music", "read")));
        peoples.add(new ImmutablePerson("Tisnux Risqulla", List.of("music", "read")));

        System.out.println(peoples);
        System.out.println(peoples.descendingSet());
        System.out.println(peoples.headSet(new ImmutablePerson("Risqulla", List.of("music", "write")), false));
        System.out.println(peoples.headSet(new ImmutablePerson("Risqulla", List.of("music", "write")), true));
        System.out.println(peoples.higher(new ImmutablePerson("Cisnux", List.of("music", "read"))));
    }
}
