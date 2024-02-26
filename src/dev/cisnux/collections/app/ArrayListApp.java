package dev.cisnux.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Fajra");
        names.add("Risqulla");
        names.addAll(Arrays.asList("Cisnux", "Fajra Cisnux", "Risqulla Cisnux"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        names.remove("Risqulla");
        names.removeAll(Arrays.asList("Cisnux", "Fajra Cisnux"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(names.contains("Fajra"));
        System.out.println(names.contains("Cisnux"));
    }
}
