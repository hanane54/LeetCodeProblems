// Runtime 288ms Beats 5.01%
// Memory 45.87MB Beats 68.14%

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for ( int i=0; i<nums.length - 1; i++ ){
            if ( nums[i] == 0 ){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
        }
        for ( int i=0; i<nums.length - 1; i++  ){
            if ( nums[i] == 0 && nums[i+1] != 0){
                moveZeroes(nums);
            }
        }
    }

    // Helper method to print arrays
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        // Test Case 1: Given example
        System.out.println("Test Case 1: Original example");
        int[] nums1 = {0,1,0,3,12};
        System.out.print("Input:  ");
        printArray(nums1);
        solution.moveZeroes(nums1);
        System.out.print("Output: ");
        printArray(nums1);
        System.out.println();

        // Test Case 2: Single element array
        System.out.println("Test Case 2: Single element");
        int[] nums2 = {0};
        System.out.print("Input:  ");
        printArray(nums2);
        solution.moveZeroes(nums2);
        System.out.print("Output: ");
        printArray(nums2);
        System.out.println();

        // Test Case 3: Array with no zeros
        System.out.println("Test Case 3: No zeros");
        int[] nums3 = {1,2,3,4,5};
        System.out.print("Input:  ");
        printArray(nums3);
        solution.moveZeroes(nums3);
        System.out.print("Output: ");
        printArray(nums3);
        System.out.println();

        // Test Case 4: Array with all zeros
        System.out.println("Test Case 4: All zeros");
        int[] nums4 = {0,0,0,0,0};
        System.out.print("Input:  ");
        printArray(nums4);
        solution.moveZeroes(nums4);
        System.out.print("Output: ");
        printArray(nums4);
        System.out.println();

        // Test Case 5: Zeros at the end
        System.out.println("Test Case 5: Zeros already at the end");
        int[] nums5 = {1,2,3,0,0};
        System.out.print("Input:  ");
        printArray(nums5);
        solution.moveZeroes(nums5);
        System.out.print("Output: ");
        printArray(nums5);
        System.out.println();

        // Test Case 6: Alternating zeros
        System.out.println("Test Case 6: Alternating zeros");
        int[] nums6 = {1,0,2,0,3,0};
        System.out.print("Input:  ");
        printArray(nums6);
        solution.moveZeroes(nums6);
        System.out.print("Output: ");
        printArray(nums6);
        System.out.println();
    }
}