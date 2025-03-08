package HackeRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore = 0; 
        int bScore = 0; 
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) < b.get(i)) {
                bScore++;
            } 
        }
        return new ArrayList<Integer>(Arrays.asList(aScore, bScore));
    }

}

public class CompareTheTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first triplet (3 space-separated integers):");
        List<Integer> a = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        System.out.println("Enter the second triplet (3 space-separated integers):");
        List<Integer> b = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        System.out.println("Result:");
        System.out.println(result.get(0) + " " + result.get(1));
        
        scanner.close();
    }
}