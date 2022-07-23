package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

public class TestAirCraft {
    @Test
    public void testInstanceOfVehicle(){
        AirCraft airCraft = new AirCraft();
        Assert.assertTrue(airCraft instanceof Vehicle);
    }


    @Test
    public void testFly() {
        AirCraft airCraft = new AirCraft();

        Assert.assertTrue(airCraft.fly());

    }
}
