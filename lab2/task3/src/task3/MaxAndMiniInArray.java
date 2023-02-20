/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author sheha
 */
public class MaxAndMiniInArray {
    
    
    int maxInArray(int [] arr, int first){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];      
            }
            first++;    
        }
        System.out.println("the time needed for this task " + System.nanoTime());

        return max;
    }
    
    int miniInArray(int [] arr, int first){
        int mini=arr[0];
        for(int i=0; i<arr.length; i++){
            if(mini > arr[i]){
                mini = arr[i];      
            }
            first++;    
        }
        System.out.println("the time needed for this task " + System.nanoTime());

        return mini;
    }
}