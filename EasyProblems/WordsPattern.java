// Runtime 1ms Beats81.85%
// Memory 41.66MB Beats24.92%

import java.util.Map;
import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        // I commented this whole solution because it does not respect the order
        // it only checks for the frequencies
        // String[] arr = s.split(" ");  
        // if ( pattern.length() != arr.length ){
        //     return false;
        // }
        // // Create frequency map for characters in the pattern
        // Map<String, Integer> freqMapStrings = new HashMap<>();
        // // Count frequencies of characters in s
        // for (String c : arr ) {
        //     freqMapStrings.put(c, freqMapStrings.getOrDefault(c, 0) + 1);
        // }
        // // Create frequency map for characters in the pattern
        // Map<Character, Integer> freqMap = new HashMap<>();
        // // Count frequencies of characters in s
        // for (char c : pattern.toCharArray()) {
        //     freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        // }
        // for(int value: freqMap.values()) {
        //    if ( !freqMapStrings.containsValue(value) ){
        //         return false;
        //    }
        // }

        // for(int value: freqMapStrings.values()) {
        //     if ( !freqMap.containsValue(value) ){
        //          return false;
        //     }
        //  }
       
        // an array of the words
        String[] wordsArray = s.split(" ");  
        if ( pattern.length() != wordsArray.length ){
            return false;
        }

        Map<String, Integer> wordsMap = new HashMap<>();
        Map<Character, Integer> patternMap = new HashMap<>();
        Map<Character, String> MappingMap = new HashMap<>();
        for ( int i=0; i<pattern.length(); i++ ){
            wordsMap.put(wordsArray[i], wordsMap.getOrDefault(wordsArray[i], 0) + 1);
            patternMap.put( pattern.charAt(i), patternMap.getOrDefault(pattern.charAt(i), 0) + 1);
            if ( !MappingMap.containsKey(pattern.charAt(i)) ){
                MappingMap.put( pattern.charAt(i)  ,  wordsArray[i] );
            }
            
            // note: when comparing two integers using the operator "==" always compare the intValue(), otherwise, it is tricky to compare the references when > 128
            if ( wordsMap.containsKey(wordsArray[i] ) && patternMap.containsKey(pattern.charAt(i)) && wordsMap.get(wordsArray[i]).intValue() == patternMap.get(pattern.charAt(i)).intValue() ){
                //freqMapStrings.put(c, freqMapStrings.getOrDefault(c, 0) + 1);
                // good
                if ( wordsMap.get(wordsArray[i] ) > 1  && !MappingMap.get(pattern.charAt(i)).equals(wordsArray[i]) ){
                    return false;
                }
                
            } else {
                return false;
            }
        }



        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();

        // Test Case 1: Example 1 from description
        System.out.println("Test Case 1:");
        String pattern1 = "aba";
        String s1 = "dog cat cat";
        System.out.println("Pattern: " + pattern1);
        System.out.println("String: " + s1);
        System.out.println("Expected: false");
        System.out.println("Output: " + solution.wordPattern(pattern1, s1));
        System.out.println();

        // Test Case 2: Example 2 from description
        System.out.println("Test Case 2:");
        String pattern2 = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s2 = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        System.out.println("Pattern: " + pattern2);
        System.out.println("String: " + s2);
        System.out.println("Expected: true");
        System.out.println("Output: " + solution.wordPattern(pattern2, s2));
        System.out.println();

        // Test Case 3: Example 3 from description
        System.out.println("Test Case 3:");
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println("Pattern: " + pattern3);
        System.out.println("String: " + s3);
        System.out.println("Expected: false");
        System.out.println("Output: " + solution.wordPattern(pattern3, s3));
        System.out.println();

        // Test Case 4: Different lengths
        System.out.println("Test Case 4:");
        String pattern4 = "abc";
        String s4 = "dog cat";
        System.out.println("Pattern: " + pattern4);
        System.out.println("String: " + s4);
        System.out.println("Expected: false");
        System.out.println("Output: " + solution.wordPattern(pattern4, s4));
        System.out.println();

        // Test Case 5: Single character/word
        System.out.println("Test Case 5:");
        String pattern5 = "a";
        String s5 = "dog";
        System.out.println("Pattern: " + pattern5);
        System.out.println("String: " + s5);
        System.out.println("Expected: true");
        System.out.println("Output: " + solution.wordPattern(pattern5, s5));
        System.out.println();

        // Test Case 6: Same words, different pattern
        System.out.println("Test Case 6:");
        String pattern6 = "abc";
        String s6 = "dog dog dog";
        System.out.println("Pattern: " + pattern6);
        System.out.println("String: " + s6);
        System.out.println("Expected: false");
        System.out.println("Output: " + solution.wordPattern(pattern6, s6));
    }
}