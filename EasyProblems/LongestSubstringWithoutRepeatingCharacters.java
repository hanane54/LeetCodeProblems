// Runtime  5ms Beats 87.39% 
// Memory 45.05MB Beats 23.69%
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if ( s.length() == 0 ) return 0;
        if ( s.length() == 1 ) return 1;

        HashMap<Character, Integer> charactersMap = new HashMap<>();

        int longestLength = 0;
        int start = 0;
        
        for ( int end=0; end<s.length(); end++){

            int currentLength = end - start + 1;

            if ( charactersMap.containsKey(s.charAt(end)) && charactersMap.get(s.charAt(end)) >= start ){
                start = charactersMap.get(s.charAt(end))+1 ; 
            }

            charactersMap.put(s.charAt(end), end);

            longestLength = Math.max(currentLength, longestLength);
        }


        return longestLength;

    }

    // Helper method to validate and print test results
    private static void runTest(String testName, String input, int expected) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println(testName + ":");
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
        System.out.println("Expected: " + expected);
        System.out.println("Status: " + (result == expected ? "PASSED" : "FAILED"));
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Example 1 from problem description
        runTest("Test Case 1", "abcabcbb", 3);

        // Test Case 2: Example 2 from problem description
        runTest("Test Case 2", "bbbbb", 1);

        // Test Case 3: Example 3 from problem description
        runTest("Test Case 3", "pwwkew", 3);

        // Test Case 4: Empty string
        runTest("Test Case 4", "", 0);

        // Test Case 5: Single character
        runTest("Test Case 5", "a", 1);

        // Test Case 6: All unique characters
        runTest("Test Case 6", "abcdef", 6);

        // Test Case 8: String with numbers
        runTest("Test Case 8", "abc123def", 9);

        // Test Case 9: Repeating pattern
        runTest("Test Case 9", "abababab", 2);

        // Test Case 10: Complex case with mixed characters
        runTest("Test Case 10", "!@#$%^&*()", 10);
    }
}