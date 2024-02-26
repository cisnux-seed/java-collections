package dev.cisnux.collections.app;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueApp {
    public static void main(String[] args) {
        final Queue<String> queue = new ArrayBlockingQueue<>(2);
        queue.add("test1");
        queue.add("test2");
//        queue.offer("test3"); // not throwing error
//        queue.add("test3"); // throwing error if violate the capacity
//        queue.add("test4");
        System.out.println(queue);
        // queue.remove(); throwing error if empty
        System.out.println(queue.size());
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
        System.out.println(queue.size());
    }
}
