
package task3;

public class BinarySearchAlgo {
    // first represents first index of array
    // last represents last index of array
    // search representa the element in which we will search
    int binarySearch(int[] arr, int search, int first, int last){
        int mid = 0;
        /* first element of the array is greater than the last one
           so that we will go to the mid by getting the average 
           mid = (first + last)/2
        */
        if(last >= first){
            arr[mid] = (first + last)/2;
            // the search will locate in the right side of the array
            if(search > arr[mid]){
                //we will get new mid 
                return binarySearch(arr, search, mid+1, last);               
            }            
            else if (search < arr[mid]){
            // the search will locate in the left side of the array
                return binarySearch(arr, search, first, mid-1);
            }
            else if (search == arr[mid]){
            //mid will be the number that we search for
                return mid;
            }    
        }
        return -1;
    }
    
}
