import java.util.HashMap;
import java.util.Map;

// Runtime 33ms Beats 27.72%
// Memory 45.18MB Beats 70.01%


public class FirstUniqueChar {
   public int firstUniqChar(String s) {
       Map<Character, Integer> sLetters = new HashMap<>();
       for ( int j=0; j<s.length(); j++ ) {
           sLetters.put(s.charAt(j), sLetters.getOrDefault(s.charAt(j), 0) + 1);
       }
      
       for ( int i=0; i<s.length(); i++ ){
           if (  sLetters.get(s.charAt(i)).intValue() == 1  ){
               return i;
           }
       }
       return -1;
   }

   public static void main(String[] args) {
       FirstUniqueChar solution = new FirstUniqueChar();

       // Test Case 1: Example 1 from description
       System.out.println("Test Case 1:");
       String s1 = "leetcode";
       System.out.println("Input: \"" + s1 + "\"");
       System.out.println("Expected Output: 0");
       System.out.println("Actual Output: " + solution.firstUniqChar(s1));
       System.out.println();

       // Test Case 2: Example 2 from description
       System.out.println("Test Case 2:");
       String s2 = "loveleetcode";
       System.out.println("Input: \"" + s2 + "\"");
       System.out.println("Expected Output: 2");
       System.out.println("Actual Output: " + solution.firstUniqChar(s2));
       System.out.println();

       // Test Case 3: Example 3 from description
       System.out.println("Test Case 3:");
       String s3 = "aabb";
       System.out.println("Input: \"" + s3 + "\"");
       System.out.println("Expected Output: -1");
       System.out.println("Actual Output: " + solution.firstUniqChar(s3));
       System.out.println();

       // Test Case 4: Empty string
       System.out.println("Test Case 4:");
       String s4 = "";
       System.out.println("Input: \"" + s4 + "\"");
       System.out.println("Expected Output: -1");
       System.out.println("Actual Output: " + solution.firstUniqChar(s4));
       System.out.println();

       // Test Case 5: Single character
       System.out.println("Test Case 5:");
       String s5 = "c";
       System.out.println("Input: \"" + s5 + "\"");
       System.out.println("Expected Output: 0");
       System.out.println("Actual Output: " + solution.firstUniqChar(s5));
       System.out.println();

       // Test Case 6: All repeating characters
       System.out.println("Test Case 6:");
       String s6 = "aaaaaa";
       System.out.println("Input: \"" + s6 + "\"");
       System.out.println("Expected Output: -1");
       System.out.println("Actual Output: " + solution.firstUniqChar(s6));
   }
}