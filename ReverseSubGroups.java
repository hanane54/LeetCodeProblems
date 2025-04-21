import java.util.ArrayList;
import java.util.Arrays;

// can be found on GFG : https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1

class ReverseSubGroups {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();

        if (k >= n) {
            reverseSubGrp(arr, 0, n - 1);
        } else {
            int numberOfSubArrays = (n + k - 1) / k;
            int counter = 0;
            for (int i = 0; i < numberOfSubArrays; i++) {
                if (counter + k > n) {
                    reverseSubGrp(arr, counter, n - 1);
                } else {
                    reverseSubGrp(arr, counter, counter + k - 1);
                }
                counter += k;
            }
        }
    }

    void reverseSubGrp(ArrayList<Long> arr, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        while (left < right) {
            Long temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseSubGroups sol = new ReverseSubGroups();

        ArrayList<Long> arr1 = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        sol.reverseInGroups(arr1, 3);
        System.out.println("Output 1: " + arr1);  // Expected: [3, 2, 1, 5, 4]

        ArrayList<Long> arr2 = new ArrayList<>(Arrays.asList(5L, 6L, 8L, 9L));
        sol.reverseInGroups(arr2, 5);
        System.out.println("Output 2: " + arr2);  // Expected: [9, 8, 6, 5]
    }
}
