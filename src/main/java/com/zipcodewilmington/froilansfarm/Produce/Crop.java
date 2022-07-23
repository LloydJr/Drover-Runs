package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;

public interface Crop <Edible> {
Boolean hasBeenHarvested = false;

Crop plant(Edible object);

}
