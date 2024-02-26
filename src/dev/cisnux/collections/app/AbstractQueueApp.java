package dev.cisnux.collections.app;

import dev.cisnux.collections.SingleQueue;

import java.util.Queue;

public class AbstractQueueApp {
    public static void main(String[] args) {
        final Queue<String> singleQueue = new SingleQueue<>();
        singleQueue.offer("fajra");
        System.out.println(singleQueue);
        singleQueue.offer("risqulla");
        System.out.println(singleQueue);

        System.out.println(singleQueue.size());
        System.out.println(singleQueue.peek());
        System.out.println(singleQueue.poll());
        System.out.println(singleQueue.poll());
        System.out.println(singleQueue.size());
    }
}
