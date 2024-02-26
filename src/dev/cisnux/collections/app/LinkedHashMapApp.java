package dev.cisnux.collections.app;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Fajra");
        map.put("middleName", "Cisnux");
        map.put("lastName", "Risqulla");

        for (final var value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        for (final var key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println();

        for (final var entry : map.entrySet()) {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }
    }
}
