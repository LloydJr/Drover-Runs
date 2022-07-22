package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Farmer <Person> implements Rider {
    //Got a warning from the IDE about using raw types and awareness of type erasure when I did
    // public class Farmer <Farmer extends Person> {}.


}
