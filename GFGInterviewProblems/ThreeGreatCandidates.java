// Problem can be found on : https://www.geeksforgeeks.org/problems/three-great-candidates0515/1
// works but not efficient in terms of time complexity
import java.util.Arrays;

class ThreeGreatCandidates {
    // Corrected maxProduct method
    int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        // code here
        // ArrayList<Integer> intermediateArr = new ArrayList<Integer>();
        // for ( int i=0; i<arr.length; i++ ){
        //     // if( !intermediateArr.contains(arr[i]) ){
        //         intermediateArr.add(arr[i] );
        //     // }
        // }
        
        // return (arr[n-1] * arr[n-2] * arr[n-3]);
        int maxRecord = Integer.MIN_VALUE;
        for ( int i=0; i<n-2; i++ ){
            for ( int j=i+1; j<n; j++ ){
                for ( int k=j+1; k<n; k++ ){
                    int currentRecord = arr[i] *  arr[j] * arr[k];
                    if(  currentRecord > maxRecord ){
                        maxRecord=currentRecord;
                    }
                }
            }
        }
        return maxRecord;
        
    }

    // Main method for testing
    public static void main(String[] args) {
        ThreeGreatCandidates solution = new ThreeGreatCandidates();
        
        // Test case 1
        int[] arr1 = {10, 3, 5, 6, 20};
        System.out.println("Test case 1: " + solution.maxProduct(arr1) + " (Expected: 1200)");
        
        // Test case 2
        int[] arr2 = {-10, -3, -5, -6, -20};
        System.out.println("Test case 2: " + solution.maxProduct(arr2) + " (Expected: -90)");
        
        // Test case 3 (your failing case)
        int[] arr3 = {852, -566, 182, -638, -693, -323};
        System.out.println("Test case 3: " + solution.maxProduct(arr3) + " (Expected: 376698168)");
        
        // Test case 4 (all positive)
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Test case 4: " + solution.maxProduct(arr4) + " (Expected: 60)");
        
        // Test case 5 (two negative, one positive)
        int[] arr5 = {-100, -100, 1, 2, 3};
        System.out.println("Test case 5: " + solution.maxProduct(arr5) + " (Expected: 30000)");
    }
}