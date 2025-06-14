// can be found on https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
// Runtime 13ms
// Beats 29.34%

// Memory 49.58MB
// Beats 83.17%

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        int result = 0;
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int count = occurrences.getOrDefault(nums[i], 0);
            occurrences.put(nums[i], count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > majority) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    // Optional: Add a main method to test
    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + solution.majorityElement(nums)); // Output: 2
    }
}
