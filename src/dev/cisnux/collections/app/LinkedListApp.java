package dev.cisnux.collections.app;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        final List<String> names = new LinkedList<>();
        names.add("Fajra Risqulla");
        names.addAll(Arrays.asList("Cisnux", "Risqulla", "Fajra"));
        System.out.println(names);
        names.set(2, "Hello 🎯");
        System.out.println(names);
        System.out.println(names.get(2));
        final var reversedList = names.reversed();
        reversedList.add("New thing");
        System.out.println(reversedList);
        reversedList.remove(2);
        System.out.println(reversedList);
    }
}
