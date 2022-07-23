package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Produce.Corn;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    void plant(Crop crop, CropRow cropRow) {
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer.plant(crop, cropRow));
    }



    @Test
    public void mount() {
    }

    @Test
    public void dismount() {
    }
}

