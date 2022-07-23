package com.zipcodewilmington.froilansfarm.Person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void setNameTest() {
        String actualName = "Froilan";
        int actualAge = 35;
        boolean hasBeenFed = true;
        Person person = new Person(actualName, actualAge, hasBeenFed);
        String expectedName = person.getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void setAgeTest() {
        String actualName = "Froilan";
        int actualAge = 35;
        boolean hasBeenFed = true;
        Person person = new Person(actualName, actualAge, hasBeenFed);
        int expectedAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void setHasBeenFed() {
        String actualName = "Froilan";
        int actualAge = 35;
        boolean hasBeenFed = true;
        Person person = new Person(actualName, actualAge, hasBeenFed);
        Assert.assertTrue(hasBeenFed);

    }
}
