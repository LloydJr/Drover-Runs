package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {

    @Test
    void plant(Crop crop, CropRow cropRow) {
       Botanist botanist = new Botanist();
        Assert.assertTrue(botanist.plant(crop, cropRow));
    }
    }

