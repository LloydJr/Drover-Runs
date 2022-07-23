package com.zipcodewilmington.froilansfarm.Produce;

public class Field<CropRow> {
    //    Field<CropRow> field = new Field<CropRow>();
    Integer numOfRows;

    public Field(Integer numOfRows,CropRow cropRow) {
        this.numOfRows = numOfRows;
        for (int i = 0; i <= numOfRows; i++) {
            this.add(cropRow);
        }
    }

    CropRow add(CropRow cropRow) {
        this.add(cropRow);
        return null;
    }

    Integer size() {
        return this.size();
    }

}