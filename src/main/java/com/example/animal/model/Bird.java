package com.example.animal.model;

import com.example.animal.behaviour.FlyingAnimal;
import com.example.animal.behaviour.SingingAnimal;
import com.example.animal.behaviour.SwimmingAnimal;

public interface Bird extends SingingAnimal, SwimmingAnimal, FlyingAnimal {
}
