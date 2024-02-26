package dev.cisnux.collections.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        final List<String> fromNames = new ArrayList<>();
        fromNames.add("fajra");
        fromNames.add("risqulla");
        fromNames.add("jaeger");
        fromNames.add("levi");
        fromNames.add("eren");
        fromNames.add("yagami");
        System.out.println(fromNames);

        Collections.reverse(fromNames);
        System.out.println(fromNames);

        Collections.shuffle(fromNames);
        System.out.println(fromNames);

        final List<String> destName = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            destName.add("test " + i);
//            destName.add(null);
        }
        System.out.println(destName);
        Collections.copy(destName, fromNames);
        System.out.println(destName);
    }
}
