package com.example.animal.model;

import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rooster implements Bird {
	@JsonProperty
	private final Sound sound;
	@JsonProperty
	private final Chicken relative;

	public Rooster(Sound sound, Chicken relateTo) {
		this.sound = sound;
		this.relative = relateTo;
	}

	public Rooster(Sound sound) {
		this.sound = sound;
		this.relative = null;
	}

	@Override
	public Sound sing() {
		return sound;
	}

	@Override
	public boolean canSing() {
		return sing() != null;
	}

	public Chicken getRelative() {
		return relative;
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
