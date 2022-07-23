package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class CropRow<Crop> {
//CropRow<Crop> cropRow = new CropRow(0);
Integer numOfCrops;
Boolean hasBeenFertilized;

    public CropRow(Integer numOfCrops,Crop crop) {
        this.numOfCrops = numOfCrops;
        for (int i = 0; i <= numOfCrops; i++) {
            this.add(crop);
        }
    }

    Crop add(Crop crop){
        this.add(crop);
    return crop;
    }

    Integer size(){
       return this.size();
 }
}
