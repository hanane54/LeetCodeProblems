// Runtime 11ms Beats 72.37%
// Memory 58.30MB Beats 33.74%

import java.util.Map;
import java.util.HashMap;

class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> uniqueElements = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            if (uniqueElements.containsKey(nums[i])) {
                return true;
            }
            uniqueElements.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates solution = new ContainsDuplicates();

        // Test Case 1: [1,2,3,1]
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test Case 1: " + solution.containsDuplicate(nums1)); // Should print true

        // Test Case 2: [1,2,3,4]
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + solution.containsDuplicate(nums2)); // Should print false

        // Test Case 3: [1,1,1,3,3,4,3,2,4,2]
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test Case 3: " + solution.containsDuplicate(nums3)); // Should print true
    }
}