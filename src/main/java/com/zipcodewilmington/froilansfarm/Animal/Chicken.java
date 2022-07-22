package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Chicken extends Animal implements Produce {

    public Chicken(Integer id, Integer age, Boolean hasBeenFed){
        super(id, age, hasBeenFed);
    }
    public void yield() {

    }

    public void eat() {

    }

    public String makeNoise() {
        return "Peep!";
    }
}
