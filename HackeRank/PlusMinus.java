package HackeRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positivesCount = 0;
        int negativesCount = 0;
        int zeroesCount = 0;
        int arrLength = arr.size(); 
        for (Integer num : arr) {
            if (num < 0) {
                negativesCount++;
            } else if (num > 0) {
                positivesCount++;
            } else {
                zeroesCount++;
            }
        }
        
        // Fix the division issue by using double instead of integer division
        BigDecimal positiveRatio = new BigDecimal( (double) positivesCount/arrLength );
    BigDecimal negativeRatio = new BigDecimal((double)  negativesCount/arrLength );
    BigDecimal zeroesRatio = new BigDecimal( (double) zeroesCount/arrLength );
    // num1.divide(num2, scale, RoundingMode.HALF_UP).toString()
    
    System.out.println( positiveRatio.setScale(6, RoundingMode.HALF_UP) + "\r" );
    System.out.println( negativeRatio.setScale(6, RoundingMode.HALF_UP)  + "\r" );
    System.out.println( zeroesRatio.setScale(6, RoundingMode.HALF_UP)  + "\r" );
    }
}

public class PlusMinus {
    public static void main(String[] args) {
        // Test with the sample input
        List<Integer> sampleInput = Arrays.asList(-4, 3, -9, 0, 4, 1);
        System.out.println("Sample Test Case:");
        Result.plusMinus(sampleInput);
        
        // Additional test cases
        System.out.println("\nTest Case 1 (All positive):");
        List<Integer> test1 = Arrays.asList(1, 2, 3, 4, 5);
        Result.plusMinus(test1);
        
        System.out.println("\nTest Case 2 (All negative):");
        List<Integer> test2 = Arrays.asList(-1, -2, -3, -4, -5);
        Result.plusMinus(test2);
        
        System.out.println("\nTest Case 3 (All zeroes):");
        List<Integer> test3 = Arrays.asList(0, 0, 0, 0);
        Result.plusMinus(test3);
        
        System.out.println("\nTest Case 4 (Mixed with more zeros):");
        List<Integer> test4 = Arrays.asList(1, -1, 0, 0, 0);
        Result.plusMinus(test4);
    }
}