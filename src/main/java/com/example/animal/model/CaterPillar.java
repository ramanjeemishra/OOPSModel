package com.example.animal.model;

public class CaterPillar implements Insect {
    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    public Insect metaphor() {
        return new ButterFly();
    }
}
