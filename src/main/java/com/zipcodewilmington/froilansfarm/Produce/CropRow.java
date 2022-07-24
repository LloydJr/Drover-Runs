package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;

public class CropRow extends Field <Crop> {
    ArrayList<Crop> croprow = new ArrayList<Crop>();

    public CropRow() {
        super();
        croprow = new ArrayList<Crop>(10);
    }


    public Object plantCrop(Object crop){
        croprow.add((Crop) crop);
        return crop;
    }

    public Crop getCrop(Crop crop, Integer index){
        return croprow.get(index);
    }

    public Integer size(){
       return croprow.size();
 }
}
