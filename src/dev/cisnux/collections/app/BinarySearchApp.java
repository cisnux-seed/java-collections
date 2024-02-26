package dev.cisnux.collections.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 1, 2, 9, 4, 7, 6, 12, 11));
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 7));
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 13));
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 9));
        System.out.println(numbers);
    }
}
