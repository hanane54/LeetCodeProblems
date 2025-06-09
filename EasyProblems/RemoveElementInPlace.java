// can be found on https://leetcode.com/problems/remove-element/
// Runtime 0ms Beats 100.00%
// Memory 42.17MB Beats 30.47%

class RemoveElementInPlace {
    public int removeElement(int[] nums, int val) {
        int k=0; 
        for ( int i=0; i<nums.length; i++ ){
            if ( nums[i] != val ){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}