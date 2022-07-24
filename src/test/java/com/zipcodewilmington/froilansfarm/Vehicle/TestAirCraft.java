package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Pilot;
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

    @Test
    public void testMakeNoise(){
        AirCraft airCraft = new AirCraft();
        String expected = "chopchopchop";

        String actual = airCraft.makeNoise();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMount(){
        Pilot pilot = new Pilot();
        AirCraft airCraft = new AirCraft();
        Boolean actual = airCraft.mounted(pilot);

        Assert.assertEquals(actual, airCraft.mounted(pilot));
    }

    @Test
    public void testDismount(){
        Pilot pilot = new Pilot();
        AirCraft airCraft = new AirCraft();
        Boolean actual = airCraft.dismounted(pilot);

        Assert.assertEquals(actual, airCraft.dismounted(pilot));
    }
}
