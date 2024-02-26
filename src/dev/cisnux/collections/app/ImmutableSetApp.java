package dev.cisnux.collections.app;

import java.util.*;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Risqulla");
        names.add("Fajra");
        names.add("Cisnux");

        final var emptyNames = Collections.<String>emptySet();
        final var singleName = Collections.singleton("gamer");
        final var unmodifiedSet = Collections.unmodifiableSet(names);
        final var immutableNames = Set.of("risqulla", "fajra", "cisnux");

        System.out.println(emptyNames);
        System.out.println(singleName);
        System.out.println(unmodifiedSet);
        System.out.println(immutableNames);
    }
}
