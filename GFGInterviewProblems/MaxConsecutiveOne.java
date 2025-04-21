// Did it from the third attempt
// can be found on GFG : https://www.geeksforgeeks.org/problems/max-consecutive-one/1

public class MaxConsecutiveOne {
        public int maxConsecutiveCount(int[] arr) {
            // code here
            int n= arr.length;
            int counter =1;
            int maxNumber=1;
            for ( int i=0; i<n-1; i++ ){
                if( arr[i] == arr[i+1] ){
                    counter++;
                    maxNumber = Math.max( maxNumber, counter );
                } else {
                    maxNumber = Math.max( maxNumber, counter );
                    // set the counter to zero again
                    counter =1; 
                }
            }
            return maxNumber;
        }
    
}
