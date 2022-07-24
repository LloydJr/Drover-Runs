package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Chicken extends Animal {


    public Boolean eat() {
return true;
    }

    public Boolean hasBeenFed() {
        return null;
    }

    public String makeNoise() {
        return "Peep!";
    }
}
