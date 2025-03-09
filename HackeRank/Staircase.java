package HackeRank;

import java.util.*;

public class Staircase {
    
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                line.append(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                line.append("#");
            }
            System.out.println(line.toString());
        }
    }
    
    public static void main(String[] args) {
        // Test with sample input n = 6
        System.out.println("Test Case 1: n = 6");
        staircase(6);
        
        // Test with n = 4 (from the example in description)
        System.out.println("\nTest Case 2: n = 4");
        staircase(4);
        
        // Test with edge case n = 1
        System.out.println("\nTest Case 3: n = 1");
        staircase(1);
        
        // Test with another value n = 10
        System.out.println("\nTest Case 4: n = 10");
        staircase(10);
    }
}