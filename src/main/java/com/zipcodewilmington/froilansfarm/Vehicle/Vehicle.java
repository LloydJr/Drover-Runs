package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public abstract class Vehicle<VehicleT extends Rider> implements NoiseMaker {

    public VehicleT vObj1;

    void operate() {

    }
}
