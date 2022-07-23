package com.zipcodewilmington.froilansfarm.Shelter;

import java.util.ArrayList;

public class Shelter <ShelterType> {

     ArrayList<ShelterType> list = new ArrayList<ShelterType>();


    public void add(ShelterType occupants) {
        list.add(occupants);

    }

    public void remove(ShelterType occupants) {
        list.remove(occupants);
    }

    public Integer getTotalOccupants() {
        return list.size();
    }
}
