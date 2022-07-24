package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.zipcodewilmington.froilansfarm.Produce.Produce;

public abstract class Edible <EdibleType> implements Produce {
    Boolean hasBeenFertilized = false;

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public Boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }


}
