package com.example.animal.model;

public class CaterPillar implements Insect {
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean walk() {
        return true;
    }

    public Insect metaphor() {
        return new ButterFly();
    }
}
