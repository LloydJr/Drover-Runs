package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class CropRow<Crop> {
ArrayList<Crop> croprow;

    public CropRow() {
        croprow = new ArrayList<Crop>(0);
    }

    public Crop plantCrop(Crop crop){
        croprow.add(crop);
        return null;
    }

    public Integer size(){
       return croprow.size();
 }
}
