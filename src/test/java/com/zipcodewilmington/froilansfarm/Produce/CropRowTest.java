package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class CropRowTest {


        @Test
        public void cropRowInstanceTest() {
            //Given
            CropRow croprow = new CropRow();
            Assert.assertEquals(croprow, croprow);
        }

    @Test
    public void cropRowZeroSizeTest() {
        //Given
        CropRow croprow = new CropRow();
        int actualSize = croprow.size();
        Assert.assertTrue(actualSize == 0);
    }


    @Test
    public void cropRowAddCropTest() {
        //Given
        CropRow croprow = new CropRow();
        Tomato mater = new Tomato();
        croprow.plantCrop(mater);
        Integer actualSize = croprow.size();
        Assert.assertTrue(1 == actualSize);
    }


}