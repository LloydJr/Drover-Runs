package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class Field<Crop> {
    ArrayList<CropRow> field = new ArrayList<>(10);
    Integer numOfRows;

    public Field() {
        field = new ArrayList<CropRow>(5);
        }

     public CropRow getCropRow(Integer index){
        return field.get(index);
     }

    public CropRow add(CropRow cropRow, Integer index) {
        field.add(index, cropRow);
        return cropRow;
    }

    public Integer size() {
        return field.size();
    }

}