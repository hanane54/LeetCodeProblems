package HackeRank;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }
        return sum;
    }

}

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int arCount = Integer.parseInt(scanner.nextLine().trim());
        
        System.out.println("Enter " + arCount + " space-separated integers:");
        List<Long> ar = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());
        
        long result = Result.aVeryBigSum(ar);
        
        System.out.println("Sum of the array elements:");
        System.out.println(result);
        
        scanner.close();
    }
}