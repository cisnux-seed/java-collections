package dev.cisnux.collections.app;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String dot = ".";
        String key2 = name + dot + first;
        System.out.println(key1 == key2);
        // don't use final key when using IdentityHashMap
        // using == equality
        Map<String, String> map = new IdentityHashMap<>();
        map.put(key1, "Fajra");
        map.put(key2, "Fajra");
        System.out.println(map);
        System.out.println(map.size());
    }
}
