package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public class Person<PersonType> implements NoiseMaker, Eater {
    public Person (String name, int age, boolean hasBeenFed){
        this. name = name;
        this.age = age;
        this.hasBeenFed = hasBeenFed;
    }
    String name;
    int age;
    boolean hasBeenFed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasBeenFed() {
        return hasBeenFed;
    }

    public void setHasBeenFed(boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
    }


    public void eat() {

    }

    public Boolean hasBeenFed() {
        return true;
    }


    public String makeNoise() {
        return "grunt!";
    }
}
