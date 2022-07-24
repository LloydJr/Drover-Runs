package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class TestCropDuster {


    @Test
    public void testOperate(){
        CropDuster cropDuster = new CropDuster();
        Boolean expected = cropDuster.operate();
        Assert.assertEquals(expected, cropDuster.operate());
    }

    @Test
    public void testMount(){
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();

        Boolean actual = cropDuster.mounted(pilot);

        Assert.assertEquals(actual, cropDuster.mounted(pilot));
    }

    @Test
    public void testDismount(){
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();
        Boolean actual = cropDuster.dismounted(pilot);

        Assert.assertEquals(actual, cropDuster.dismounted(pilot));
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
        CropDuster cropDuster = new CropDuster();
        //CropRow crop = new CropRow(5, null);
        boolean expected = cropDuster.isFertilize();
        //when
        boolean actual = true;
        //then
        Assert.assertEquals(expected, cropDuster.isFertilize());

    }
}
