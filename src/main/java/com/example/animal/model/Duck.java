package com.example.animal.model;

import com.example.animal.behaviour.SingingAnimal;
import com.example.animal.behaviour.SwiminingAnimal;
import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Duck implements SwiminingAnimal, SingingAnimal, Bird {

    private final boolean canSwim;
    @JsonProperty
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
