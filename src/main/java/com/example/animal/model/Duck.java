package com.example.animal.model;

import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Duck implements Bird {

	@JsonProperty
	private Sound sound;

	public Duck(Sound sound) {
		this.sound = sound;
	}

	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public Sound sing() {
		return sound;
	}

	@Override
	public boolean canSing() {
		return sing() != null;
	}


	@Override
	public boolean canFly() {
		return true;
	}
}
