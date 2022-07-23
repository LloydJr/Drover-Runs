package com.zipcodewilmington.froilansfarm.Shelter;
import org.junit.Test;
import org.junit.Assert;
public class ShelterTest {
    Shelter s = new Shelter();
    ChickenCoop c = new ChickenCoop();
    @Test
    public void addTest() {
        s.add(c);
        Assert.assertTrue(s.shelterlist.contains(c));
    }
    @Test
    public void removeTest() {
        s.add(c);
        s.remove(c);
        Assert.assertFalse(s.shelterlist.contains(c));
    }
    @Test
    public void getTotalOccupantsTest(){
        s.add(c);
        s.shelterlist.size();
        Integer actual = s.getTotalOccupants();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}