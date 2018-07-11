package com.example.animal.model;


import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parrot implements Bird {

	@JsonProperty
	private Sound sound;

	public Parrot(Sound sound) {
		this.sound = sound;
	}

	@Override
	public Sound sing() {
		return sound;
	}

	@Override
	public boolean canSing() {
		return sound != null;
	}

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public boolean canSwim() {
		return false;
	}
}
