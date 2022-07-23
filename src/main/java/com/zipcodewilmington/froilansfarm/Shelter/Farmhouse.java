package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;

public class Farmhouse extends Shelter <Person> {

    ArrayList<Person> personList = new ArrayList<Person>();

    Person p = new Person("Froilian",35,true);


    @Override
    public void add(Person occupants) {
        personList.add(occupants);
    }

    @Override
    public void remove(Person occupants) {
        personList.remove(occupants);
    }

    @Override
    public Integer getTotalOccupants() {
        return personList.size();
    }
}
