package com.example.animal.behaviour;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface SwiminingAnimal {
    @JsonProperty
    boolean swim();
}
