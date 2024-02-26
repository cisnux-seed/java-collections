package dev.cisnux.collections.app;

import dev.cisnux.collections.MutablePerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {
        final List<String> hobbies = new ArrayList<>();
        hobbies.add("foody");
        hobbies.add("gamer");
        final var person = new MutablePerson("fajra", hobbies);
        System.out.println(person.hobbies());
        doSomethingWithHobbies(person.hobbies()); // [foody, gamer]
        // it should not be added
        System.out.println(person.hobbies()); // [foody, gamer, invalid]
    }

    // static void doSomethingWithHobbies is package private
    // so other class in this package can access
    private static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("invalid");
    }
}
