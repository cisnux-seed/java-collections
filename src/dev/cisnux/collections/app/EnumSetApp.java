package dev.cisnux.collections.app;

import dev.cisnux.collections.Gender;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumSetApp {
    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        System.out.println(genders);
        System.out.println(Arrays.toString(Gender.values()));
    }
}
