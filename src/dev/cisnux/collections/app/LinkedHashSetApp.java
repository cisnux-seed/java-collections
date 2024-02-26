package dev.cisnux.collections.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        // guarantee will be sorted by input time
        Set<String> names = new LinkedHashSet<>();
        names.add("Risqulla");
        names.add("Fajra");
        names.add("Cisnux");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
