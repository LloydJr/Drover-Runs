package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestTractor {
    @Test
    public void testInstanceOfVehicle(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
    }

    @Test
    public void testOperate(){
        Tractor tractor = new Tractor();
        Boolean expected = tractor.operate();
        Assert.assertEquals(expected, tractor.operate());
    }

    @Test
    public void testNoise(){
        Tractor tractor = new Tractor();
        String expected = "vroooom";

        String actual = tractor.makeNoise();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMount(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        Boolean actual = tractor.mounted(farmer);

        Assert.assertEquals(actual, tractor.mounted(farmer));
    }

    @Test
    public void testDismount(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        Boolean actual = tractor.dismounted(farmer);

        Assert.assertEquals(actual, tractor.dismounted(farmer));
    }
    @Test
    public void testHarvest() {
        Tractor tractor = new Tractor();
        Boolean expected = tractor.harvest();
        Assert.assertEquals(expected, tractor.harvest());

    }
}
