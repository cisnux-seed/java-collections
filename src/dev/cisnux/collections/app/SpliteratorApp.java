package dev.cisnux.collections.app;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorApp {
    public static void main(String[] args) {
        final List<String> names = List.of("Risqulla", "Cisnux", "Fajra", "Eren", "Levi", "Yagami");
        final Spliterator<String> spliterator1 = names.spliterator();
        final Spliterator<String> spliterator2 = spliterator1.trySplit();
        final Spliterator<String> spliterator3 = spliterator2.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
        System.out.println(spliterator3.estimateSize());
        System.out.println();

        spliterator1.forEachRemaining(System.out::println);
        System.out.println();
        spliterator2.forEachRemaining(System.out::println);
        System.out.println();
        spliterator3.forEachRemaining(System.out::println);
    }
}
