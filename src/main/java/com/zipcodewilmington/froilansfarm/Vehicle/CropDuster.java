package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public class CropDuster extends AirCraft implements FarmVehicle {
    public boolean isFertilize(CropRow cropRow) {
        if (fly()) {
            boolean hasBeenFertilized = true;
        }
        return false;
    }


    public void operate() {

    }

    public Boolean mounted() {

        return null;
    }

    public Boolean dismounted() {

        return null;
    }
}
