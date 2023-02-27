/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3;

/**
 *
 * @author sheha
 */
public class Lab3 {

    public static void main(String[] args) {
        float tempC = 24;
        Float fehren = new TempConvert().apply(tempC);
        
        System.out.println("temp is: " + tempC + "c or " + fehren + "f");
  
    }
}
