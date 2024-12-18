// this class would remove the duplicates from a sorted array 
// and it also updates the given array in parameter to contain only unique elements
// the returned int value is the number of unique elements existing within the given array
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // a Set contains unique elements, this collection is to save memory
        // a linked hash set contains unique and sorted elements
        Set<Integer> newArr = new LinkedHashSet<>();
        for (int num : nums) {
            newArr.add(num);
        }
        
        // convert the Set to an array 
        Integer[] uniqueArray = newArr.toArray(new Integer[0]);
    
        // update the array given from the parameter
        for (int i = 0; i < uniqueArray.length; i++) {
            nums[i] = uniqueArray[i];
        }
    
        return newArr.size();
    }

    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();
        
        // Test cases
        int[][] testCases = {
            {1, 1, 2},                 // Array with duplicates
            {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},  // Multiple duplicates
            {1, 2, 3, 4, 5},            // No duplicates
            {},                         // Empty array
            {1, 1, 1, 1, 1}             // All duplicates
        };
        
        for (int[] testCase : testCases) {
            int uniqueCount = remover.removeDuplicates(testCase);
            System.out.print("Input: [");
            for (int num : testCase) {
                System.out.print(num + " ");
            }
            System.out.println("] | Unique Elements: " + uniqueCount);
        }
    }
}