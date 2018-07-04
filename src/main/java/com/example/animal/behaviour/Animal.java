package com.example.animal.behaviour;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Animal {

    @JsonProperty
    default boolean canFly() {
        return false;
    }

    @JsonProperty
    default boolean canWalk() {
        return false;
    }

    @JsonProperty
    default boolean canSing() {
        return false;
    }

    @JsonProperty
    default boolean canSwim() {
        return false;
    }
}
