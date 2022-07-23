package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import org.junit.Assert;
import org.junit.Test;

public class TestCropDuster {

    @Test
    public void testMount(){
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();
        pilot.mount();
    }

    @Test
    public void testExtendsAirCraft(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof AirCraft);
    }
    @Test
    public void testExtendsVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }
    @Test
    public void testImplFarmVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void testNoise(){
        CropDuster cropDuster = new CropDuster();
        String expected = "chopchopchop";

        String actual = cropDuster.makeNoise();

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testFertilize() {
        //given

        //when

        //then

    }
}
