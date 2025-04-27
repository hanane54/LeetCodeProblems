package GFGInterviewProblems;
// https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
// already solved one similar, solution was in place, this one is intuitive 

class MoveZeroesGFG {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] intermediateArr = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                intermediateArr[counter] = arr[i];
                counter++;
            }
        }
        while (counter < n) {
            intermediateArr[counter] = 0;
            counter++;
        }
        
        // Copy the intermediate array back to the original array
        System.arraycopy(intermediateArr, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        MoveZeroesGFG solution = new MoveZeroesGFG();
        
        // Test case 1
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.print("Test case 1 - Before: ");
        printArray(arr1);
        solution.pushZerosToEnd(arr1);
        System.out.print("Test case 1 - After:  ");
        printArray(arr1);
        System.out.println("Expected: [1, 2, 4, 3, 5, 0, 0, 0]");
        System.out.println();
        
        // Test case 2
        int[] arr2 = {10, 20, 30};
        System.out.print("Test case 2 - Before: ");
        printArray(arr2);
        solution.pushZerosToEnd(arr2);
        System.out.print("Test case 2 - After:  ");
        printArray(arr2);
        System.out.println("Expected: [10, 20, 30]");
        System.out.println();
        
        // Test case 3
        int[] arr3 = {0, 0};
        System.out.print("Test case 3 - Before: ");
        printArray(arr3);
        solution.pushZerosToEnd(arr3);
        System.out.print("Test case 3 - After:  ");
        printArray(arr3);
        System.out.println("Expected: [0, 0]");
        System.out.println();
        
        // Additional test case 4
        int[] arr4 = {0, 1, 0, 3, 12};
        System.out.print("Test case 4 - Before: ");
        printArray(arr4);
        solution.pushZerosToEnd(arr4);
        System.out.print("Test case 4 - After:  ");
        printArray(arr4);
        System.out.println("Expected: [1, 3, 12, 0, 0]");
        System.out.println();
        
        // Additional test case 5 (all non-zero)
        int[] arr5 = {5, 7, 3, 2};
        System.out.print("Test case 5 - Before: ");
        printArray(arr5);
        solution.pushZerosToEnd(arr5);
        System.out.print("Test case 5 - After:  ");
        printArray(arr5);
        System.out.println("Expected: [5, 7, 3, 2]");
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
}