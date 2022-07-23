package com.zipcodewilmington.froilansfarm.Shelter;

import org.junit.Test;
import org.junit.Assert;

public class ShelterTest {
    Shelter s = new Shelter();
    ChickenCoop c = new ChickenCoop();
    @Test
    public void getTotalOccupantsTest(){
        //Given
        s.list.size();
        //Actual
        Integer actual = s.getTotalOccupants();
        //Expected
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void add() {
        s.add(c);
        Assert.assertTrue(s.list.contains(c));
    }
    @Test
    public void remove() {
        s.add(c);

        s.remove(c);
        Assert.assertFalse(s.list.contains(c));
    }
}