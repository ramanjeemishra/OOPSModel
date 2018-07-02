package com.example.animal.controller;


import com.example.animal.model.Animal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @RequestMapping("/animals")
    public Animal[] getAnimals() {
        return new Animal[]{};
    }
}
