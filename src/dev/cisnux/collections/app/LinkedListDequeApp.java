package dev.cisnux.collections.app;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeApp {
    public static void main(String[] args) {
        // stack
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Preview");
        stack.offerLast("Camera");
        stack.offerLast("Capture");

        System.out.println(stack);
        System.out.println(stack.size());
        for (var item = stack.pollLast(); item != null; item = stack.pollLast()){
            System.out.println(item);
        }
        System.out.println(stack.size());
        System.out.println();

        // queue
        Deque<String> queue = new LinkedList<>();
        queue.offerFirst("Preview");
        queue.offerFirst("Camera");
        queue.offerFirst("Capture");

        System.out.println(queue);
        System.out.println(queue.size());
        for (var item = queue.pollFirst(); item != null; item = queue.pollFirst()){
            System.out.println(item);
        }
        System.out.println(queue.size());
    }
}
