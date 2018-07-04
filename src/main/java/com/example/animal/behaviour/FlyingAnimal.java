package com.example.animal.behaviour;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface FlyingAnimal {
    @JsonProperty
    boolean fly();
}
