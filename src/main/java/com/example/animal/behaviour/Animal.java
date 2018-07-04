package com.example.animal.behaviour;

public interface Animal {
    default boolean canFly() {
        return false;
    }

    default boolean canWalk() {
        return false;
    }

    default boolean canSing() {
        return false;
    }

    default boolean canSwim() {
        return false;
    }
}
