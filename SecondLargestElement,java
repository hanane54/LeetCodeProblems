// problem can be found on GFG : https://www.geeksforgeeks.org/problems/second-largest3735/1
class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        // code here
        int[] intermediateArr = new int[arr.length-1];
        int firstLargest = -1; 
        for ( int i=0; i<arr.length; i++ ){
            if ( arr[i]>firstLargest ){
                firstLargest =arr[i];
            }
            
        }
        int counter =0; 
        for (  int i=0; i<arr.length; i++  ){
            if ( arr[i] != firstLargest ){
                intermediateArr[counter]=arr[i];
                counter++;
            }
        }
        
        if( counter ==0 ){
            return -1;
        }
        
        int secondLargest = -1; 
        boolean foundSecondLargest = false;
         for ( int i=0; i<intermediateArr.length; i++ ){
             if ( secondLargest< intermediateArr[i]){
                 secondLargest = intermediateArr[i] ;
                 foundSecondLargest =  true;
             } 
           
        }
        
        if ( foundSecondLargest ){
            return secondLargest;
        } else {
            return -1;
        }
        
        
    }
}