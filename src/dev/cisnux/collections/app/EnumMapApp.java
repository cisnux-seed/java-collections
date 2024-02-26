package dev.cisnux.collections.app;

import dev.cisnux.collections.Level;

import java.util.EnumMap;

public class EnumMapApp {
    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.PREMIUM, "Bayar");

        System.out.println(map);
        System.out.println(map.get(Level.FREE));
    }
}
