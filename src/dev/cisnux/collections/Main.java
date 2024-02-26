package dev.cisnux.collections;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Iterable<String> names = List.of("Fajra", "Risqulla", "Cisnux");
        // iterator define how we access the collection
        final Iterator<String> iterator = names.iterator();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        while (iterator.hasNext()) {
            final var name = iterator.next();
            System.out.println(name);
        }
    }
}