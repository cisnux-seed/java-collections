package dev.cisnux.collections.app;

import java.util.ArrayList;
import java.util.function.Consumer;

public class DefaultMethodCollectionApp {
    public static void main(String[] args) {
        final var numbers = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        numbers.forEach(System.out::println);
        numbers.forEach(number -> System.out.printf("number: %d\n", number));
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.printf("number: %d\n", integer);
//            }
//        });
        numbers.replaceAll(number -> (int) Math.pow(number, 2));
        System.out.println(numbers);
    }
}
