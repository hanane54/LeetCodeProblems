import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// worked from the first submission
// can be found on GeeksForGeeks at https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
public class MissingOne {

    ArrayList<Integer> findTwoElement(int arr[]) {
        HashMap<Integer, Integer> occurences = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (occurences.containsKey(arr[i])) {
                occurences.put(arr[i], occurences.get(arr[i]) + 1);
            } else {
                occurences.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            if (entry.getValue() == 2) { // the repeated number would have an occurence of 2 ( just based on the problem description ) 
                result.add(entry.getKey());
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!occurences.containsKey(i)) {
                result.add(i);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MissingOne solution = new MissingOne();

        int[] test1 = {2, 2};
        System.out.println(solution.findTwoElement(test1));  // Output: [2, 1]

        int[] test2 = {1, 3, 3};
        System.out.println(solution.findTwoElement(test2));  // Output: [3, 2]

        int[] test3 = {4, 3, 6, 2, 1, 1};
        System.out.println(solution.findTwoElement(test3));  // Output: [1, 5]
    }
}
