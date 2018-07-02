package com.example.animal.model;

import com.example.animal.behaviour.SingingAnimal;
import com.example.animal.behaviour.Sound;
import com.example.animal.behaviour.SwiminingAnimal;

public class Duck extends Bird implements SwiminingAnimal, SingingAnimal {

    private final boolean canSwim;
    private Sound sound;

    public Duck(Sound sound) {
        this.canSwim = true;
        this.sound = sound;
    }

    @Override
    public Sound sing() {
        return sound;
    }

    @Override
    public boolean swim() {
        return canSwim;
    }
}
