package com.zipcodewilmington.froilansfarm.GenericUtils;

public interface Rideable <RideableType> {
    Boolean mounted(RideableType object);
    Boolean dismounted(RideableType object);
}
