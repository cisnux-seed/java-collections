package dev.cisnux.collections;

public enum Gender {
    MAN("man"),
    WOMAN("woman"),
    NOT_MENTION("not mention");

    public String getValue() {
        return value;
    }

    private final String value;

    Gender(String value) {
        this.value = value;
    }
}
