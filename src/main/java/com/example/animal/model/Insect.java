package com.example.animal.model;

import com.example.animal.behaviour.FlyingAnimal;
import com.example.animal.behaviour.WalkingAnimal;

public abstract class Insect extends Animal implements FlyingAnimal, WalkingAnimal {
}
