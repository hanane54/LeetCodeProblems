// this is considered as an easy problem on LeetCode, but I seriously do not conider it easy
// I had to get hints from ChatGpt 
// I had the algorithm in my mind but with bigger complexity which is so not good
// this solution beats 100% of LeetCode users in terms of time and 26% in terms of memory
public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Handle empty array
        }

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix found
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"interstellar", "internet", "interval"},
            {"apple", "ape", "april"},
            {"java", "javascript", "jazz"},
            {"a"}, // Single string
            {} // Empty array
        };

        // Execute tests and print results
        for (String[] testCase : testCases) {
            System.out.println("Input: " + java.util.Arrays.toString(testCase));
            System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(testCase));
            System.out.println("-------------------------");
        }
    }
}
