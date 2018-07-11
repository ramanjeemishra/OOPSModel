package com.example.animal.behaviour;

import com.example.animal.model.Animal;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface SwimmingAnimal extends Animal {
	@JsonProperty
	boolean canSwim();
}
