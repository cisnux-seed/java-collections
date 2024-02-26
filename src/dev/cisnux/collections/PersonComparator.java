package dev.cisnux.collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<ImmutablePerson> {

    @Override
    public int compare(ImmutablePerson o1, ImmutablePerson o2) {
        return Comparator.comparing(ImmutablePerson::name).compare(o1, o2);
    }
}
