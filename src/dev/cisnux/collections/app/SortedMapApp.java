package dev.cisnux.collections.app;


import dev.cisnux.collections.ImmutablePerson;

import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Risqulla", 1);
        map.put("Cisnux", 2);
        map.put("Fajra", 3);
        System.out.println(map);

        SortedMap<ImmutablePerson, Integer> map1 = new TreeMap<>((o1, o2) -> Comparator.comparing(ImmutablePerson::name).compare(o1, o2));
        map1.put(new ImmutablePerson("Fajra", List.of("programming", "gaming")), 1);
        map1.put(new ImmutablePerson("Cisnux", List.of("foody")), 2);
        map1.put(new ImmutablePerson("Risqulla", List.of("foody", "programming")), 3);
        System.out.println(map1);
    }
}
