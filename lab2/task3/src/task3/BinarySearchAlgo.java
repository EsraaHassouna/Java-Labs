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
public class BinarySearchAlgo {
    
    void binarySearch(int[] arr, int search, int first, int last){
        int mid = 0;
        /* first element of the array is greater than the last one
           so that we will go to the mid by getting the average 
           mid = (first + last)/2
        */
        if(last > first){
            mid = (first + last)/2;
            // the search will locate in the right side of the array
            if(search > arr[mid]){
                //we will get new mid 
                binarySearch(arr, search, mid+1, last);
                
            }            
            
            
        }




    }
    
}
