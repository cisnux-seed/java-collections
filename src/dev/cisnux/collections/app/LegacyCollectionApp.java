package dev.cisnux.collections.app;

import java.util.*;

public class LegacyCollectionApp {
    public static void main(String[] args) {
        final List<String> names = new Vector<>();
        names.add("Risqulla");
        names.add("Cisnux");
        names.add("Fajra");

        System.out.println(names);

        final Map<String, String> map = new Hashtable<>();
        map.put("firstName", "Fajra");
        map.put("middleName", "Cisnux");
        map.put("lastName", "Risqulla");
        System.out.println();
        for (final var entry : map.entrySet()) {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }

        final Stack<String> stackNames = new Stack<>();
        stackNames.push("Risqulla");
        stackNames.push("Cisnux");
        stackNames.push("Fajra");
        System.out.println();
        try {
            for (var name = stackNames.pop(); name != null; name = stackNames.pop()) {
                System.out.println(name);
            }
        } catch (EmptyStackException e) {
            System.out.println("empty");
        }
    }
}
