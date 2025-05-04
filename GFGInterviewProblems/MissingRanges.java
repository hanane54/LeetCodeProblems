// can be found on GFG https://www.geeksforgeeks.org/problems/missing-ranges-of-numbers1019/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // int prev=lower-1; 
        // int end = upper+1;
        // for ( int i=0; i<arr.lengt; i++ ){
        //     int current = arr[i] ; 
        //     if ( current >prev+1 ){
                
        //         prev = current; 
        //     }
        // }
        List<List<Integer>> result = new ArrayList<>();
        long prev = (long) lower - 1;
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            
            long curr = (i < n) ? arr[i] : (long) upper + 1;

            if (curr > prev + 1) {
                result.add(Arrays.asList((int)(prev + 1), (int)(curr - 1)));
            }

            prev = curr;
        }

        return result;
    }
}
