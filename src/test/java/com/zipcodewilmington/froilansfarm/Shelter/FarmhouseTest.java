package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class FarmhouseTest {
    Farmhouse f = new Farmhouse();
    Person p = new Person("Froilian", 35, true);
    @Test
    public void addTest() {
        f.add(p);
        Assert.assertTrue(f.personList.contains(p));
    }
    @Test
    public void removeTest() {
        f.add(p);
        f.remove(p);
        Assert.assertFalse(f.personList.contains(p));
    }
    @Test
    public void getTotalOccupantsTest() {
        f.add(p);
        Integer actual = f.getTotalOccupants();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}