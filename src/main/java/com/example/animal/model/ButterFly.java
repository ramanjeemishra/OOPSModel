package com.example.animal.model;

public class ButterFly implements Insect {
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
