package dev.cisnux.collections.app;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        // not guarantee will be sorted by input time
        Set<String> names = new HashSet<>();
        names.add("Risqulla");
        names.add("Fajra");
        names.add("Cisnux");
        names.add("Cisnux");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
