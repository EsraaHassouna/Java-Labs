package com.mycompany.lab3;

import java.util.function.Function;

public class TempConvert implements Function <Float,Float> {

    @Override
    public Float apply(Float t) {
 
        float temp=24;
        float fehren = (float) ((temp * 1.8) + 32);
        return fehren;
 
    }
 
}
