package dev.cisnux.collections.app;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class DefaultMethodMapApp {
    public static void main(String[] args) {
        final var numbers = new HashMap<String, Integer>();

        for (int i = 0; i < 100; i++) {
            numbers.put(String.format("key %d", i + 1), i + 1);
        }

        System.out.println(numbers);
        numbers.forEach((s, integer) -> System.out.printf("%s : %d\n", s, integer));
//        numbers.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.printf("%s : %d\n", s, integer);
//            }
//        });
        System.out.println(numbers);
        numbers.replaceAll((s, integer) -> (int) Math.pow(integer, 2));
        System.out.println(numbers);
    }
}
