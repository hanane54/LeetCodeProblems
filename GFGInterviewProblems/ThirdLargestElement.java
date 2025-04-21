// Though I am not convinced how this worked !! 
// problem can be found on GFG: https://www.geeksforgeeks.org/problems/third-largest-element/1
import java.util.Arrays;

class ThirdLargestElement {
    int thirdLargest(int arr[]) {
        int n=arr.length;
        // sort the array
        Arrays.sort(arr);
        return arr[n-3];
        
    }
}
