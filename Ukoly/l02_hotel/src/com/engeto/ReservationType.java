package com.engeto;

public enum ReservationType {
    WORK("pracovní"),
    HOLIDAY("rekreační");

    String description;

    ReservationType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
