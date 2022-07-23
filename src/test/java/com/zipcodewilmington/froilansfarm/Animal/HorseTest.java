package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {


    @Test
    public void isAnAnimalTest(){
        //Arrange
        Horse horse = new Horse();
        //Assert
        Assert.assertTrue(horse instanceof Animal);
    }
    @Test
    public void mountedTest() {
        //Arrange
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //When
        Assert.assertEquals(horse.mounted(farmer), farmer.mount(horse));
    }

    @Test
    public void dismountedTest() {
        //Arrange
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //Assert
        Assert.assertEquals(horse.dismounted(farmer), farmer.dismount(horse));
    }

    @Test
    public void makeNoiseTest(){
        //Arrange
        Horse horse = new Horse();
        //Act
        String noise = "Neigh!";
        //Assert
        Assert.assertEquals(noise, horse.makeNoise());

    }
}