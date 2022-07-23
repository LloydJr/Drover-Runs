package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public class Farmer <PersonType, Botanist>  implements Rider  {


    public boolean plant(Crop crop, CropRow cropRow) {
        return true;
    }

    public Boolean mount(Horse object) {
        return null;
    }

    public Boolean dismount(Horse object) {
        return null;
    }


    //Got a warning from the IDE about using raw types and awareness of type erasure when I did
    // public class Farmer <Farmer extends Person> {}.


}
