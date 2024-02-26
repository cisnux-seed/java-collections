package dev.cisnux.collections.app;

import java.util.Arrays;
import java.util.List;

public class ListConversionApp {
    public static void main(String[] args) {
        final List<String> names = List.of("Risqulla", "Cisnux", "Fajra");
        final Object[] objects = names.toArray();
        final String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
