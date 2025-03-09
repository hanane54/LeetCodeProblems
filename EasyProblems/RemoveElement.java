// according to the description of the problem what I did is correct but the 
// test cases are confusing and not well implemented
import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // int k=0;
        // Array list containing the integers not equal to val
        List<Integer> elements = new ArrayList<>();
   
        // Appending the new element at the end of the list
        for (int i = 0; i < nums.length; i++) {
            if (  nums[i] != val  ){
                elements.add(nums[i]);
            }
            // elements.add(nums.length);
        }
        // int[] intermediateArr = new int[elements.size()];
        for ( int i=0; i<elements.size(); i++ ){
            nums[i]=elements.get(i);
        }
        for ( int i=elements.size(); i<nums.length; i++ ){
            nums[i]=val;
        }
        // nums = intermediateArr;
        return elements.size();
    }

    // Helper method to print arrays
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        // Test Case 1: Basic case with multiple occurrences
        System.out.println("Test Case 1:");
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        System.out.println("Original Array: ");
        printArray(nums1);
        System.out.println("Value to remove: " + val1);
        System.out.println("Expected Output: 2"); // [2,2]
        int result1 = solution.removeElement(nums1, val1);
        System.out.println("Returned k: " + result1);
        System.out.println("Modified Array: ");
        printArray(nums1);
        System.out.println();

        // Test Case 2: Value appears multiple times
        System.out.println("Test Case 2:");
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println("Original Array: ");
        printArray(nums2);
        System.out.println("Value to remove: " + val2);
        System.out.println("Expected Output: 5"); // [0,1,3,0,4]
        int result2 = solution.removeElement(nums2, val2);
        System.out.println("Returned k: " + result2);
        System.out.println("Modified Array: ");
        printArray(nums2);
        System.out.println();

        // Test Case 3: Empty array
        System.out.println("Test Case 3:");
        int[] nums3 = {};
        int val3 = 1;
        System.out.println("Original Array: ");
        printArray(nums3);
        System.out.println("Value to remove: " + val3);
        System.out.println("Expected Output: 0");
        int result3 = solution.removeElement(nums3, val3);
        System.out.println("Returned k: " + result3);
        System.out.println("Modified Array: ");
        printArray(nums3);
        System.out.println();

        // Test Case 4: No occurrences of val
        System.out.println("Test Case 4:");
        int[] nums4 = {1, 2, 3, 4};
        int val4 = 5;
        System.out.println("Original Array: ");
        printArray(nums4);
        System.out.println("Value to remove: " + val4);
        System.out.println("Expected Output: 4"); // [1,2,3,4]
        int result4 = solution.removeElement(nums4, val4);
        System.out.println("Returned k: " + result4);
        System.out.println("Modified Array: ");
        printArray(nums4);
        System.out.println();

        // Test Case 5: All elements are val
        System.out.println("Test Case 5:");
        int[] nums5 = {1, 1, 1, 1};
        int val5 = 1;
        System.out.println("Original Array: ");
        printArray(nums5);
        System.out.println("Value to remove: " + val5);
        System.out.println("Expected Output: 0"); // []
        int result5 = solution.removeElement(nums5, val5);
        System.out.println("Returned k: " + result5);
        System.out.println("Modified Array: ");
        printArray(nums5);
    }
}