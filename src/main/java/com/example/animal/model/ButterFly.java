package com.example.animal.model;

public class ButterFly implements Insect {
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean walk() {
        return false;
    }
}
