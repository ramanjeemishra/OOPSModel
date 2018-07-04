package com.example.animal.behaviour;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface WalkingAnimal {
    @JsonProperty("walk")
    boolean walk();
}
