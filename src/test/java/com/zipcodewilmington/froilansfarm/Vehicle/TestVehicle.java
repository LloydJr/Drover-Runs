package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;
import org.junit.Assert;
import org.junit.Test;

public class TestVehicle {
    @Test
    public void testOperate(){
        Vehicle vehicle = new Vehicle() {
            @Override
            public Boolean mounted(Rider object) {
                return null;
            }

            @Override
            public Boolean dismounted(Rider object) {
                return null;
            }

            @Override
            public String makeNoise() {
                return null;
            }
        };
        Boolean expected = vehicle.operate();
        Assert.assertEquals(expected, vehicle.operate());
    }


}
