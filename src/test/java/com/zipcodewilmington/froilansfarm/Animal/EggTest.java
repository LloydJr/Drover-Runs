package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void fertilizedTest() {
        //Act
        Egg egg;
        //When
        Boolean expected = Egg.hasBeenFertilized();
        //Assert
        Assert.assertEquals(expected, true);
    }
}