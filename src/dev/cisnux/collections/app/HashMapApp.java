package dev.cisnux.collections.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        // using equals method
        Map<String, String> map = new HashMap<>();
        map.put("firstName","Fajra");
        map.put("middleName","Cisnux");
        map.put("lastName","Risqulla");
        System.out.println(map);
        map.put("lastName","Risqu");
        System.out.println(map);
        map.remove("middleName");
        System.out.println(map);
    }
}
