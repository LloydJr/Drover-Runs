package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public interface Person <Person extends Eater> extends NoiseMaker, Eater {
}
