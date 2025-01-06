// Runtime 2ms Beats 76.10%
// Memory 45.23MB Beats 67.40%


public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean foundSummit = false;
        int summitIndex = 0;
        if ( arr.length>=3 ){
            for ( int i=1; i<arr.length-1; i++ ){
                if ( arr[i]>arr[i-1] && arr[i]>arr[i+1] ){
                    foundSummit = true;
                    summitIndex = i;
                }
            }
        } else {
            return false;
        }

        // check if all the numbers before summit are incrementing
        if ( foundSummit ){
            for ( int j = 1; j<summitIndex; j++ ){
                if ( arr[j-1]>=arr[j] ){
                    return false;
                }
            }
            for ( int j=summitIndex+1; j<arr.length-1; j++ ){
                if ( arr[j]<=arr[j+1]  ){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
        
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
    ValidMountainArray solution = new ValidMountainArray();

    // Test Case 1: Example 1 from description
    System.out.println("Test Case 1:");
    int[] arr1 = {0,1,2,4,2,1};
    System.out.print("Input array: ");
    printArray(arr1);
    System.out.println("Expected Output: true");
    System.out.println("Actual Output: " + solution.validMountainArray(arr1));
    System.out.println();

    // Test Case 2: Example 2 from description
    System.out.println("Test Case 2:");
    int[] arr2 = {3, 5, 5};
    System.out.print("Input array: ");
    printArray(arr2);
    System.out.println("Expected Output: false");
    System.out.println("Actual Output: " + solution.validMountainArray(arr2));
    System.out.println();

    // Test Case 3: Example 3 from description
    System.out.println("Test Case 3:");
    int[] arr3 = {0, 3, 2, 1};
    System.out.print("Input array: ");
    printArray(arr3);
    System.out.println("Expected Output: true");
    System.out.println("Actual Output: " + solution.validMountainArray(arr3));
    System.out.println();

    // Test Case 4: Empty array
    System.out.println("Test Case 4:");
    int[] arr4 = {};
    System.out.print("Input array: ");
    printArray(arr4);
    System.out.println("Expected Output: false");
    System.out.println("Actual Output: " + solution.validMountainArray(arr4));
    System.out.println();

    // Test Case 5: Single element
    System.out.println("Test Case 5:");
    int[] arr5 = {1};
    System.out.print("Input array: ");
    printArray(arr5);
    System.out.println("Expected Output: false");
    System.out.println("Actual Output: " + solution.validMountainArray(arr5));
    System.out.println();

    // Test Case 6: Strictly increasing
    System.out.println("Test Case 6:");
    int[] arr6 = {1, 2, 3, 4};
    System.out.print("Input array: ");
    printArray(arr6);
    System.out.println("Expected Output: false");
    System.out.println("Actual Output: " + solution.validMountainArray(arr6));
    System.out.println();

    // Test Case 7: Strictly decreasing
    System.out.println("Test Case 7:");
    int[] arr7 = {4, 3, 2, 1};
    System.out.print("Input array: ");
    printArray(arr7);
    System.out.println("Expected Output: false");
    System.out.println("Actual Output: " + solution.validMountainArray(arr7));
}
}
