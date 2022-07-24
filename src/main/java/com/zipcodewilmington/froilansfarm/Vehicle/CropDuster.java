package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class CropDuster extends AirCraft implements FarmVehicle {
    public boolean isFertilize() {
        if (fly()) {
            boolean hasBeenFertilized = true;
        }
        return false;
    }


    public Boolean operate() {

        return null;
    }

    public Boolean mounted(Pilot object) {

        return null;
    }

    public Boolean dismounted(Pilot object) {

        return null;
    }
}
