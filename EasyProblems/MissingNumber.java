import java.util.TreeMap;
// Runtime 39ms Beats 5.00%
// Memory 46.12MB Beats 5.13%
class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Create a TreeMap that stores the element as key and its frequency as value
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // Store array elements
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for ( int i=0; i<=n; i++ ){
            if ( !map.containsKey(i) ){
                return i;
            }
        }
       
        return 0;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        
        // Test Case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Test Case 1:");
        System.out.println("Input: [3,0,1]");
        System.out.println("Output: " + solution.missingNumber(nums1));
        System.out.println("Expected: 2");
        System.out.println();
        
        // Test Case 2
        int[] nums2 = {0, 1};
        System.out.println("Test Case 2:");
        System.out.println("Input: [0,1]");
        System.out.println("Output: " + solution.missingNumber(nums2));
        System.out.println("Expected: 2");
        System.out.println();
        
        // Test Case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Test Case 3:");
        System.out.println("Input: [9,6,4,2,3,5,7,0,1]");
        System.out.println("Output: " + solution.missingNumber(nums3));
        System.out.println("Expected: 8");
    }
}