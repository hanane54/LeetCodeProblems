// Runtime 12ms Beats11.62%
// Memory 41.96MB Beats36.06%

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sLetters = new HashMap<>();
        Map<Character, Integer> tLetters = new HashMap<>();
        // char[] ch = str.toCharArray();
        for ( int j=0; j<s.length(); j++ ) {
            sLetters.put(s.charAt(j), sLetters.getOrDefault(s.charAt(j), 0) + 1);
        }
        for ( int j=0; j<t.length(); j++ ) {
            tLetters.put(t.charAt(j), tLetters.getOrDefault(t.charAt(j), 0) + 1);
        }
        for ( int i=0; i<t.length(); i++ ){
            if ( !sLetters.containsKey(t.charAt(i)) ||  ( sLetters.containsKey(t.charAt(i)) && sLetters.get(t.charAt(i)).intValue() != tLetters.get(t.charAt(i)).intValue() ) ){
                return t.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        FindTheDifference solution = new FindTheDifference();

        // Test Case 1: Example 1 from description
        System.out.println("Test Case 1:");
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("String s: \"" + s1 + "\"");
        System.out.println("String t: \"" + t1 + "\"");
        System.out.println("Expected Output: 'e'");
        System.out.println("Actual Output: '" + solution.findTheDifference(s1, t1) + "'");
        System.out.println();

        // Test Case 2: Example 2 from description
        System.out.println("Test Case 2:");
        String s2 = "";
        String t2 = "y";
        System.out.println("String s: \"" + s2 + "\"");
        System.out.println("String t: \"" + t2 + "\"");
        System.out.println("Expected Output: 'y'");
        System.out.println("Actual Output: '" + solution.findTheDifference(s2, t2) + "'");
        System.out.println();

        // Test Case 3: Added letter in the middle
        System.out.println("Test Case 3:");
        String s3 = "hello";
        String t3 = "hello!x";
        System.out.println("String s: \"" + s3 + "\"");
        System.out.println("String t: \"" + t3 + "\"");
        System.out.println("Expected Output: 'x'");
        System.out.println("Actual Output: '" + solution.findTheDifference(s3, t3) + "'");
        System.out.println();

        // Test Case 4: Repeated characters
        System.out.println("Test Case 4:");
        String s4 = "aaa";
        String t4 = "aaaa";
        System.out.println("String s: \"" + s4 + "\"");
        System.out.println("String t: \"" + t4 + "\"");
        System.out.println("Expected Output: 'a'");
        System.out.println("Actual Output: '" + solution.findTheDifference(s4, t4) + "'");
        System.out.println();

        // Test Case 5: Single character and its duplicate
        System.out.println("Test Case 5:");
        String s5 = "a";
        String t5 = "aa";
        System.out.println("String s: \"" + s5 + "\"");
        System.out.println("String t: \"" + t5 + "\"");
        System.out.println("Expected Output: 'a'");
        System.out.println("Actual Output: '" + solution.findTheDifference(s5, t5) + "'");
    }
}