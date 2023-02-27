package com.mycompany.mavenproject3;

import java.util.function.Function;

public class InnerClassTemp {
   public class Inner implements Function<Float,Float> {

        @Override
        public Float apply(Float t) {
            float temp=24;
            float fehren = (float) ((temp * 1.8) + 32);
            return fehren;
 
        }
    }
    public static void main(String[] args) {
        float tempC = 24;
        float fehren = new Inner().apply(tempC);
        System.out.println("temp is: " + tempC + "c or " + fehren + "f");
  
    
    
    }

    
    
    
}
