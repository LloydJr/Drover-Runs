package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;

public class Crop<E> {
    private Boolean hasBeenHarvested;


    public Crop(){
        setHasBeenHarvested(false);

    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }





}
