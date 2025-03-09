package HackeRank;
import java.util.*;

public class SockMerchantCalculator {
    
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // Count occurrences of each sock color
        for (int sock : ar) {
            sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
        }

        // Count the number of pairs
        int pairs = 0;
        for (int count : sockCounts.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        // Hardcoded values
        int n = 9;
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

        // Compute and print the result
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
