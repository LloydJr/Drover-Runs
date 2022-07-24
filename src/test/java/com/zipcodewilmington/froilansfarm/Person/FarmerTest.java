package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void plant() {
        Farmer farmer = new Farmer();
        CropRow cropRow = new CropRow();
        Crop crop = new Crop<>();
        Assert.assertTrue(farmer.plant(crop, cropRow));
    }



    @Test
    public void mount() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //Assert
        Assert.assertEquals(horse.dismounted(farmer), farmer.dismount(horse));
    }

    @Test
    public void dismount() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //Assert
        Assert.assertEquals(horse.dismounted(farmer), farmer.dismount(horse));
    }
}

