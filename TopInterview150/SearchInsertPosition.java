// Runtime 0ms Beats 100.00% 
// Memory 43.12MB Beats 38.59%
// can be found on https://leetcode.com/problems/search-insert-position/submissions/1726657393/
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        while ( i<nums.length ){
            if( nums[i] >= target ){
                return i;
            } 
            i++;
        }
        return i;
    }
}