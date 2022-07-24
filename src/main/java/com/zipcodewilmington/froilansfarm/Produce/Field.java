package com.zipcodewilmington.froilansfarm.Produce;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field<CropRow> {
    ArrayList<CropRow> field;
    Integer numOfRows;

    public Field() {
        field = new ArrayList<CropRow>(0);
        }

    CropRow add(CropRow cropRow) {
        field.add(cropRow);
        return cropRow;
    }

    Integer size() {
        return field.size();
    }

}