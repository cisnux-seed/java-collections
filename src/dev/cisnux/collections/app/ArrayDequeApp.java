package dev.cisnux.collections.app;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeApp {
    public static void main(String[] args) {
        // stack
        Deque<String> stack = new ArrayDeque<>();
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
        Deque<String> queue = new ArrayDeque<>();
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
