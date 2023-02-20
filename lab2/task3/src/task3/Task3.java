package task3;

public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={10,20,30,40,50,60};
        int search=40;
        int n = arr.length;
      
        
       /* BinarySearchAlgo x = new BinarySearchAlgo();
        int result = x.recBinarySearch(arr, search, 0, n-1);
        if (result== -1) 
                System.out.print("elment not found");
        else 
            System.out.print("The indix of 40 : " + result);
        */       
        BinarySearchAlgo x = new BinarySearchAlgo();
        
        int result=x.logicBinarySearch(arr, 60, 0, n-1);
        
        if (result== -1) 
                System.out.print("elment not found");
        else 
                System.out.print("The indix of 40 : " + result);
    }
}    