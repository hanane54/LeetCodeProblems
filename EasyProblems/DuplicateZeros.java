// Runtime 3ms Beats 51.95%
// Memory 45.20MB Beats 8.33%

import java.util.ArrayList;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        
        for ( int i=0; i<arr.length; i++ ){
            if ( arr[i] == 0 ){
                tempArr.add(0);
                tempArr.add(0);
            } else {
                tempArr.add(arr[i]);
            }
        }

        for ( int i=0; i<arr.length; i++ ){
            arr[i] = tempArr.get(i);
        }

        // get the number of zeros within the array
        // if there are none, return the same array
        // if there are more then one create a new array having the size of arr plus duplicated zeros
        // fill the new array according to the zeroes

    }
    public static void main(String[] args) {
        DuplicateZeros solution = new DuplicateZeros();
        
        // Test Case 1
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Test Case 1:");
        System.out.print("Original array: ");
        printArray(arr1);
        solution.duplicateZeros(arr1);
        System.out.print("Modified array: ");
        printArray(arr1);
        
        // Test Case 2
        int[] arr2 = {1, 2, 3};
        System.out.println("\nTest Case 2:");
        System.out.print("Original array: ");
        printArray(arr2);
        solution.duplicateZeros(arr2);
        System.out.print("Modified array: ");
        printArray(arr2);
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
}
