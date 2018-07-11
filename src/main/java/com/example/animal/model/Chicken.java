package com.example.animal.model;

import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Chicken implements Bird {

	@JsonProperty
	private Sound sound;

	public Chicken(Sound sound) {
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
		return false;
	}

	@Override
	public boolean canSwim() {
		return false;
	}
}
