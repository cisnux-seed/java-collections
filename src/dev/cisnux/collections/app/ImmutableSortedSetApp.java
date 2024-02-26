package dev.cisnux.collections.app;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImmutableSortedSetApp {
    public static void main(String[] args) {
        SortedSet<String> names = new TreeSet<>();
        names.add("Risqulla");
        names.add("Fajra");
        names.add("Cisnux");

        final var emptyNames = Collections.<String>emptySortedSet();
        final var unmodifiedSortedSet = Collections.unmodifiableSortedSet(names);

        System.out.println(emptyNames);
        System.out.println(unmodifiedSortedSet);
    }
}
