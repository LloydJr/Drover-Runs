package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;

public class Stable extends Shelter <Horse> {

public ArrayList <Horse> list = new ArrayList<Horse>();

    @Override
    public void add(Horse occupants) {
        super.add(occupants);
    }

    @Override
    public void remove(Horse occupants) {
        super.remove(occupants);
    }
}

