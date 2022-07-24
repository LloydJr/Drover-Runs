package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public interface Rider <RiderType extends Rideable> {
    Boolean mount(RiderType object);
    Boolean dismount(RiderType object);
}
