package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;

import java.util.*;

public class ImmutableSortedMapApp {
    public static void main(String[] args) {
        final var emptySortedPersons = Collections.<ImmutablePerson, Integer>emptySortedMap();
        SortedMap<ImmutablePerson, Integer> map = new TreeMap<>((o1, o2) -> Comparator.comparing(ImmutablePerson::name).compare(o1, o2));
        map.put(new ImmutablePerson("Fajra", List.of("programming", "gaming")), 1);
        map.put(new ImmutablePerson("Cisnux", List.of("foody")), 2);
        map.put(new ImmutablePerson("Risqulla", List.of("foody", "programming")), 3);
        System.out.println(map);
        final var immutableSortedPersons = Collections.unmodifiableSortedMap(map);
//        immutableSortedPersons.put(new ImmutablePerson("XVR", List.of("foody", "programming")), 4);
    }
}
