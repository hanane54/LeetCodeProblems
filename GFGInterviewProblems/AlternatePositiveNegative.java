// fixed it from the very first attempt
// can be found on https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

import java.util.ArrayList;
import java.util.Arrays;

class AlternatePositiveNegative {
    void rearrange(ArrayList<Integer> arr) {
        int maxLength = arr.size();
        ArrayList<Integer> positives = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();

        for (int i = 0; i < maxLength; i++) {
            if (arr.get(i) >= 0) {
                positives.add(arr.get(i));
            } else {
                negatives.add(arr.get(i));
            }
        }

        ArrayList<Integer> rearrangedArr = new ArrayList<Integer>();

        int i = 0, j = 0;

        // Alternate between arrays while both have elements
        while (i < positives.size() && j < negatives.size()) {
            rearrangedArr.add(positives.get(i++));
            rearrangedArr.add(negatives.get(j++));
        }

        // Add remaining elements from positives
        while (i < positives.size()) {
            rearrangedArr.add(positives.get(i++));
        }

        // Add remaining elements from negatives
        while (j < negatives.size()) {
            rearrangedArr.add(negatives.get(j++));
        }

        // Update original array
        arr.clear();
        arr.addAll(rearrangedArr);
    }

    public static void main(String[] args) {
        AlternatePositiveNegative sol = new AlternatePositiveNegative();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        sol.rearrange(arr1);
        System.out.println(arr1);  // Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        sol.rearrange(arr2);
        System.out.println(arr2);  // Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(9, 5, -2, -1, 5, 0, -5, -3, 2));
        sol.rearrange(arr3);
        System.out.println(arr3);  // Output: [9, -2, 5, -1, 5, -5, 0, -3, 2]
    }
}
