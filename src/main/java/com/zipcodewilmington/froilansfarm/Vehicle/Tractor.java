package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Person.Farmer;

public class Tractor<TractorT extends Farmer> extends Vehicle implements FarmVehicle{

    void harvest(){

    }

    public void operate() {

    }


    public Boolean mounted() {

        return null;
    }

    public Boolean dismounted() {

        return null;
    }

    public String makeNoise() {
        return "vroooom";
    }

    public Boolean mounted(Rider object) {
        return null;
    }

    public Boolean dismounted(Rider object) {
        return null;
    }
}
