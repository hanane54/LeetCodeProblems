//Runtime 16ms Beats 25.05%
// Memory 45.08MB Beats 9.88%
import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create frequency map for characters in s
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count frequencies of characters in s
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Check characters in t against the frequency map
        for (char c : t.toCharArray()) {
            if (!freqMap.containsKey(c) || freqMap.get(c) == 0) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        
        // Test Case 1: Example 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test Case 1:");
        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: " + solution.isAnagram(s1, t1));
        System.out.println();
        
        // Test Case 2: Example 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Test Case 2:");
        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: " + solution.isAnagram(s2, t2));
        System.out.println();
        
        // Test Case 3: The failing case
        String s3 = "aacc";
        String t3 = "ccac";
        System.out.println("Test Case 3:");
        System.out.println("Input: s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: " + solution.isAnagram(s3, t3));
    }
}