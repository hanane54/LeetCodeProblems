package HackeRank;

import java.util.*;

class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumDiag1 = sumDiag1 + arr.get(i).get(i);
            sumDiag2 = sumDiag2 + arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(sumDiag1 - sumDiag2);
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {
        try {
            // Test Case 1: The sample test case from the problem
            List<List<Integer>> matrix1 = new ArrayList<>();
            matrix1.add(Arrays.asList(11, 2, 4));
            matrix1.add(Arrays.asList(4, 5, 6));
            matrix1.add(Arrays.asList(10, 8, -12));
            
            int result1 = Result.diagonalDifference(matrix1);
            System.out.println("Test Case 1 - Expected: 15, Actual: " + result1);
            
            // Test Case 2: Another test case
            List<List<Integer>> matrix2 = new ArrayList<>();
            matrix2.add(Arrays.asList(1, 2, 3));
            matrix2.add(Arrays.asList(4, 5, 6));
            matrix2.add(Arrays.asList(9, 8, 9));
            
            int result2 = Result.diagonalDifference(matrix2);
            System.out.println("Test Case 2 - Expected: 2, Actual: " + result2);
            
            // Test Case 3: A 4x4 matrix
            List<List<Integer>> matrix3 = new ArrayList<>();
            matrix3.add(Arrays.asList(1, 2, 3, 4));
            matrix3.add(Arrays.asList(5, 6, 7, 8));
            matrix3.add(Arrays.asList(9, 10, 11, 12));
            matrix3.add(Arrays.asList(13, 14, 15, 16));
            
            int result3 = Result.diagonalDifference(matrix3);
            System.out.println("Test Case 3 - Expected: 0, Actual: " + result3);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}