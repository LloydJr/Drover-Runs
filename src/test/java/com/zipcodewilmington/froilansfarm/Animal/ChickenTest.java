package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void isAnAnimalTest() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void makeNoiseTest(){
        //Given
        Chicken chicken = new Chicken();
        //When
        String noise = "Peep!";
        //Then
        Assert.assertEquals(noise, chicken.makeNoise());

    }
}