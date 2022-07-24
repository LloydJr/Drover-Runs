package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<VehicleT extends Rider> implements NoiseMaker, Rideable {


    Boolean operate() {
        return null;
    }


}
