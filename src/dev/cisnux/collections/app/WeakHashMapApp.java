package dev.cisnux.collections.app;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            final double value = Math.pow(i + 1, 2);
            map.put(i, (int) value);
        }
//        System.out.println(map);
        System.out.println(map.size()); // 782552
        System.gc();
        System.out.println(map.size()); // 782552
    }
}
