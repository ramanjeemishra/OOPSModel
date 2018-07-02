package com.example.animal.model;

import com.example.animal.behaviour.FlyingAnimal;
import com.example.animal.behaviour.SingingAnimal;
import com.example.animal.behaviour.Sound;
import com.example.animal.behaviour.SwiminingAnimal;

public class Chicken extends Bird implements SingingAnimal, FlyingAnimal {

    private Sound sound;

    public Chicken(Sound sound) {
        this.sound = sound;
    }

    @Override
    public Sound sing() {
        return sound;
    }

    @Override
    public boolean fly() {
        return false;
    }
}
