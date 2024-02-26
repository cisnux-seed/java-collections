package dev.cisnux.collections.app;


import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        final Queue<String> queue = new PriorityQueue<>();
        queue.offer("Risqulla");
        queue.offer("Cisnux");
        queue.offer("Fajra");

        System.out.println(queue);

        final Queue<String> queue2 = new PriorityQueue<>(Comparator.reverseOrder());
        queue2.offer("Risqulla");
        queue2.offer("Cisnux");
        queue2.offer("Fajra");

        System.out.println(queue2);
    }
}
