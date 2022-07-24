package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Egg extends Chicken implements Produce {
    Edible edible;

    public Boolean fertilize() {
        return true;
    }

}
