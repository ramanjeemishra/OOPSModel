package com.example.animal.behaviour;

import com.example.animal.model.Animal;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface WalkingAnimal extends Animal {
    @JsonProperty("walk")
    boolean canWalk();
}
