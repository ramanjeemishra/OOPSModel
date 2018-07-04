package com.example.animal.behaviour;

import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface SingingAnimal {
    @JsonProperty
    Sound sing();
}
