package com.zipcodewilmington.froilansfarm.GenericUtils;

public interface Rideable <RideableType extends Rider> {
    Boolean mounted(RideableType object);
    Boolean dismounted(RideableType object);
}
