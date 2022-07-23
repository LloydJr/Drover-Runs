package com.zipcodewilmington.froilansfarm.Shelter;
import java.util.ArrayList;
public class Shelter <ShelterType> {
    ArrayList<ShelterType> shelterlist = new ArrayList<ShelterType>();
    public void add(ShelterType occupants) {
        shelterlist.add(occupants);
    }
    public void remove(ShelterType occupants) {
        shelterlist.remove(occupants);
    }
    public Integer getTotalOccupants() {
        return shelterlist.size();
    }
}
