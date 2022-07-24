package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Chicken extends Animal {


    public void eat(Produce produce) {}

    public Boolean hasBeenFed() {
        return true;
    }

    public String makeNoise() {
        return "Peep!";
    }
}
