package TopInterview150;

// Updated to improve memory usage 

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // // abs(0 - 3) <= 3
        // for ( int i=0; i<nums.length; i++ ){
        //     for ( int j=i+1; j<nums.length; j++ ){
        //         if ( nums[i] == nums[j] && Math.abs(j-i) <= k  ){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}