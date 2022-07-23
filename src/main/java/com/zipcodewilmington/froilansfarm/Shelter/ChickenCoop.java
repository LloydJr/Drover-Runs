package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends Shelter <Chicken> {

Chicken c = new Chicken();

    ArrayList<Chicken> chickenList = new ArrayList<Chicken>();

    @Override
    public void add(Chicken occupants) {
        chickenList.add(occupants);
    }

    @Override
    public Integer getTotalOccupants() {
        return chickenList.size();
    }

    @Override
    public void remove(Chicken occupants) {
        chickenList.remove(occupants);
    }
}


