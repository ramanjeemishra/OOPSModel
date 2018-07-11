package com.example.animal.behaviour;

import com.example.animal.model.Animal;
import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface SingingAnimal extends Animal {
	@JsonProperty
	Sound sing();

	boolean canSing();
}
