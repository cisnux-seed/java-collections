package dev.cisnux.collections.app;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueApp {
    public static void main(String[] args) {
        final Queue<String> queue = new ArrayDeque<>(2);
        queue.add("test1");
        queue.add("test2");
        queue.add("test3");
        queue.offer("test4");

        System.out.println(queue);
        System.out.println(queue.size());
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
        System.out.println(queue.size());
    }
}
