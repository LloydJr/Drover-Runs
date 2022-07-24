package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.zipcodewilmington.froilansfarm.Produce.Produce;

public interface Eater {
     void eat(Produce produce);
     Boolean hasBeenFed();
}
