package com.example.animal.model;

import com.example.animal.behaviour.SingingAnimal;
import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rooster implements SingingAnimal, Bird {
    @JsonProperty
    private final Sound sound;

    private final Chicken relative;

    public Rooster(Sound sound, Chicken relative) {
        this.sound = sound;
        this.relative = relative;
    }

    public Rooster(Sound sound) {
        this.sound = sound;
        this.relative = null;
    }

    @Override
    public Sound sing() {
        return sound;
    }

    public Chicken getRelative() {
        return relative;
    }


}
