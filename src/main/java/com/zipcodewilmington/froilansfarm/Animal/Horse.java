package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Horse extends Animal implements Rideable {

    public void eat() {

    }

    public Boolean hasBeenFed() {
        return null;
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public Boolean mounted(Rider object) {
        return null;
    }

    public Boolean dismounted(Rider object) {
        return null;
    }
}
