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
        Assert.assertEquals(cropDuster.mounted(pilot), pilot.mount(cropDuster));
    }
    @Test
    public void testDismounted() {
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        Assert.assertEquals(cropDuster.dismounted(pilot), pilot.dismount(cropDuster));
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

