package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testMounted() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        Assert.assertTrue(cropDuster.mounted(pilot));
    }
    @Test
    public void testDismounted() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        Assert.assertTrue(cropDuster.dismounted(pilot));
    }
    @Test
    public void testTestMount() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        //Assert.assertTrue(pilot.mount(cropDuster));
    }
    @Test
    public void testTestDismount() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        //Assert.assertTrue(pilot.dismount(cropDuster));
    }
}

