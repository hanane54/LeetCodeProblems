package GFGInterviewProblems;
// should not use Set or HashSet to solve this problem
// can be found on : https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

public class RemoveDuplicatesSortedArray {
    // a bit confusing, since we had to update the original array in-place 
    public int removeDuplicates(int[] arr) {
        // Code Here
        if (arr.length == 0) return 0;

        int j = 0;  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];  
            }
        }
        return j + 1;
    }
}
