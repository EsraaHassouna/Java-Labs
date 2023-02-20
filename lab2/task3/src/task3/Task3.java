package task3;

public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={10,20,30,40,50,60};
        int search=20;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
               
        BinarySearchAlgo x = new BinarySearchAlgo();
        
        int result=x.logicBinarySearch(arr, search, 0, n-1);
        
        if (result== -1) 
                // when we use binary search in unsorted array so we get that element not found result 
                System.out.println("using binary search elment "+ search +" not found");
        else 
                System.out.println("The indix of " + search + " : " + result);
        

        MaxAndMiniInArray obj = new MaxAndMiniInArray(); 
        
        //variable to get maximum value in the array
        int maximum=obj.maxInArray(arr,0);
        System.out.println("The max value is " + maximum);
        //variable to get minimum value in the array
        int minimum=obj.miniInArray(arr,0);
        System.out.println("The mini value is " + minimum);

        
        
        
        
        
    }

       /* BinarySearchAlgo x = new BinarySearchAlgo();
        int result = x.recBinarySearch(arr, search, 0, n-1);
        if (result== -1) 
                System.out.print("elment not found");
        else 
            System.out.print("The indix of 40 : " + result);
        */

}    