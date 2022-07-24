package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class StableTest {
    Stable s = new Stable();
    Horse h = new Horse();
    @Test
    public void add() {
        s.add(h);
        assertTrue(s.horseList.contains(h));
    }
    @Test
    public void remove() {
        s.add(h);
        s.remove(h);
        assertFalse(s.horseList.contains(h));
    }
    @Test
    public void getTotalOccupants() {
        s.add(h);
        Integer actual = s.getTotalOccupants();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}