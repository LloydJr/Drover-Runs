package com.zipcodewilmington.froilansfarm.GenericUtils;

public interface Rideable <RideableType extends Rider> {
    void mounted();
    void dismounted();
}
