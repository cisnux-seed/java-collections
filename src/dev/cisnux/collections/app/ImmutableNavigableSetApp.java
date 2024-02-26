package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;
import dev.cisnux.collections.PersonComparator;

import java.util.*;

public class ImmutableNavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<ImmutablePerson> peoples = new TreeSet<>(new PersonComparator());
        peoples.add(new ImmutablePerson("Fajra", List.of("game")));
        peoples.add(new ImmutablePerson("Risqulla", List.of("music", "write")));
        peoples.add(new ImmutablePerson("Cisnux", List.of("music", "read")));
        peoples.add(new ImmutablePerson("Tisnux Risqulla", List.of("music", "read")));

        final var emptyPeoples = Collections.<String>emptyNavigableSet();
        final var unmodifiedNavigableSet = Collections.unmodifiableNavigableSet(peoples);

        System.out.println(emptyPeoples);
        System.out.println(unmodifiedNavigableSet);
    }
}
