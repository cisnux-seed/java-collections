package dev.cisnux.collections;

import java.util.Collections;
import java.util.List;

public record ImmutablePerson(String name, List<String> hobbies) {
    @Override
    public List<String> hobbies() {
        // Arrays.asList() this is immutable as well
        return Collections.unmodifiableList(hobbies);
    }
}
