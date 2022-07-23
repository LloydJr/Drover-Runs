package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import java.util.ArrayList;
public class Stable extends Shelter <Horse> {
public ArrayList <Horse> horseList = new ArrayList<Horse>();
    @Override
    public void add(Horse occupants) {
        horseList.add(occupants);
    }
    @Override
    public void remove(Horse occupants) {
        horseList.remove(occupants);
    }
    @Override
    public Integer getTotalOccupants() {
        return horseList.size();
    }
}

