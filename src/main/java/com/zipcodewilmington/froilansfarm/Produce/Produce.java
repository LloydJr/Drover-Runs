package com.zipcodewilmington.froilansfarm.Produce;

public interface Produce<Edible> extends Crop {
Integer amount = 0;
Boolean hasBeenFertilized = false;


 Boolean fertilize();



}
