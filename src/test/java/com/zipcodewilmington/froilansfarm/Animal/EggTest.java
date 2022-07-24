package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void fertilizedTest() {
        //Act
        Egg egg = new Egg() {
        };
        //When
        Boolean expected = egg.fertilize();
        //Assert
        Assert.assertEquals(expected, true);

    }
}