package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {
    Integer id;
    Integer age;
    Boolean hasBeenFed;

    public Animal(Integer id, Integer age, Boolean hasBeenFed){
        this.id = id;
        this.age = age;
        this.hasBeenFed = hasBeenFed;
    }
}
