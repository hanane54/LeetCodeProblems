class ContainsDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // // abs(0 - 3) <= 3
        for ( int i=0; i<nums.length; i++ ){
            for ( int j=i+1; j<nums.length; j++ ){
                if ( nums[i] == nums[j] && Math.abs(j-i) <= k  ){
                    return true;
                }
            }
        }
        return false;
    }
}