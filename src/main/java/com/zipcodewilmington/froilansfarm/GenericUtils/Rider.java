package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Person;

public interface Rider <RiderType extends Horse, Vehicle> {
    Boolean mount(RiderType object);
    Boolean dismount(RiderType object);
}
