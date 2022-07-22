package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.zipcodewilmington.froilansfarm.Person.Person;

public interface Rider <RiderType extends Person> {
    void mount();
    void dismount();
}
