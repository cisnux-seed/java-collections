package dev.cisnux.collections.app;

import dev.cisnux.collections.ImmutablePerson;

import java.util.*;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<ImmutablePerson, Integer> map = new HashMap<>();
        map.put(new ImmutablePerson("Fajra", List.of("programming", "gaming")), 1);
        map.put(new ImmutablePerson("Cisnux", List.of("foody")), 2);
        map.put(new ImmutablePerson("Risqulla", List.of("foody", "programming")), 3);

        for (final var entry : map.entrySet()) {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }
    }
}
