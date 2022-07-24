package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {
    @Test
    public void cropInstanceTest() {
        //Given
        Crop crop = new Crop();
        Assert.assertEquals(crop, crop);
    }

    @Test
    public void cropHasBeenHarvested() {
        //Given
        Crop crop = new Crop();
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }

}