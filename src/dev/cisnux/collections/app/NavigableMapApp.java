package dev.cisnux.collections.app;

import java.util.*;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("Risqulla", 1);
        map.put("Cisnux", 2);
        map.put("Fajra", 3);
        System.out.println(map);
        System.out.println(map.lowerEntry("Fajra"));
        System.out.println(map.lowerKey("Fajra"));
        System.out.println(map.lowerEntry("Fajra").getValue());
        System.out.println();
        System.out.println(map.higherEntry("Fajra"));
        System.out.println(map.higherKey("Fajra"));
        System.out.println(map.higherEntry("Fajra").getValue());
    }
}
