package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.AirCraft;

public class Pilot <PilotType, PersonType> extends AirCraft implements Rider {


    public Boolean mounted(Rider object) {
        return null;
    }

    public Boolean dismounted(Rider object) {
        return null;
    }

    public Boolean mount(Horse object) {
        return null;
    }

    public Boolean dismount(Horse object) {
        return null;
    }
}
