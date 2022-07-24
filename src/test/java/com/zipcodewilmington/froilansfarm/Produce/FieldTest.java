package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void fieldInstanceTest() {
        //Given
        Field field = new Field();
        Assert.assertEquals(field, field);
    }

    @Test
    public void fieldSizeTest() {
        //Given
        Field field = new Field();
        int fieldSize = field.size();
        Assert.assertTrue(fieldSize == 0);
    }

    @Test
    public void fieldAddCropRowTest() {
        //Given
        Field field = new Field();
        CropRow<Crop> cropRow = new CropRow<Crop>();
        field.add(cropRow);
        Integer actualSize = field.size();
        Assert.assertTrue(1 == actualSize);
    }


}

