package com.example.animal.behaviour;

import com.example.animal.model.Animal;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface FlyingAnimal extends Animal {
    @JsonProperty
    boolean canFly();
}
