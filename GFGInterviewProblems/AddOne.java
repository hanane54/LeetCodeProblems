// limit time exceeded for this solution, should be optimized 
// Can be found on https://www.geeksforgeeks.org/problems/adding-one2529/1
import java.util.*;

class AddOne {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        StringBuilder number = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            number.append(Integer.toString(arr[i]));
        }

        java.math.BigInteger finalNumber = new java.math.BigInteger(number.toString()).add(java.math.BigInteger.ONE);
        
        String finalNumberToString = finalNumber.toString();
        Vector<Integer> resultArr = new Vector<>();
        for (int i = 0; i < finalNumberToString.length(); i++) {
            resultArr.add(finalNumberToString.charAt(i) - '0');  // Convert char to int
        }

        return resultArr;
    }

    // Main method for testing
    public static void main(String[] args) {
        AddOne solution = new AddOne();

        int[] arr1 = {5, 6, 7, 8};
        System.out.println("Input: [5, 6, 7, 8] -> Output: " + solution.addOne(arr1));

        int[] arr2 = {9, 9, 9};
        System.out.println("Input: [9, 9, 9] -> Output: " + solution.addOne(arr2));

        int[] arr3 = {9, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1, 7, 1, 1, 5, 2, 7, 6, 1, 4, 2, 3, 2, 2, 1, 6, 8, 5, 7, 6, 1, 8, 9, 2, 7, 9, 5, 4, 3, 1, 2, 3, 3, 4, 1, 1, 3, 8, 7, 4, 2, 7, 7, 9, 3, 1, 9, 8, 6, 5, 0, 2, 8, 6, 0, 2, 4, 8, 6, 5, 0, 9, 0, 0, 6, 1, 3, 8, 9, 3, 4, 4, 6, 0, 6, 6, 1, 8, 4, 9};
        System.out.println("Long Input -> Output: " + solution.addOne(arr3));
    }
}
