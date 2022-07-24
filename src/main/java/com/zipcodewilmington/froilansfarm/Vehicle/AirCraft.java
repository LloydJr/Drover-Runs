package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class AirCraft extends Vehicle<Pilot> {
    private boolean isFlying = false;

    public boolean fly() {
        this.isFlying = true;
        return isFlying;
    };

    public String makeNoise() {
        return "chopchopchop";
    }


    public Boolean mounted(Rider object) {
        return null;
    }

    public Boolean dismounted(Rider object) {
        return null;
    }
}


