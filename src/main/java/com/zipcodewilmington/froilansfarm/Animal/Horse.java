package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Horse extends Animal implements Rideable {

    public void eat(Produce produce) {}


    public Boolean hasBeenFed() {
        return true;
    }

    public String makeNoise() {
        return "Neigh!";
    }

//    public Boolean mounted(Rider object) {
//        return null;
//    }
//
//    public Boolean dismounted(Rider object) {
//        return null;
//    }

    @Override
    public Boolean mounted(Object object) {
        return null;
    }

    @Override
    public Boolean dismounted(Object object) {
        return null;
    }
}
