package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class ChickenCoopTest {
ChickenCoop cc = new ChickenCoop();
Chicken ch = new Chicken();
    @Test
    public void addTest() {
        cc.add(ch);
        Assert.assertTrue(cc.chickenList.contains(ch));
    }
    @Test
    public void removeTest() {
        cc.add(ch);
        cc.remove(ch);
        Assert.assertFalse(cc.chickenList.contains(ch));
    }
    @Test
    public void getTotalOccupantsTest() {
        cc.add(ch);
        cc.chickenList.size();
        Integer actual = cc.getTotalOccupants();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}