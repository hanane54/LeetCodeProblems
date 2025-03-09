// Runtime 52ms Beats 16.32%
// Memory 45.75MB Beats 9.53%

import java.util.HashMap;
import java.util.Map;

public class WordsThatCanBeFormed {
    public int countCharacters(String[] words, String chars) {
         // Create a frequency map for the characters in `chars`
         Map<Character, Integer> charsFrequency = new HashMap<>();
         for (char c : chars.toCharArray()) {
             charsFrequency.put(c, charsFrequency.getOrDefault(c, 0) + 1);
         }
 
         int counter = 0;
 
         // Iterate through each word
         for (String word : words) {
             // Create a frequency map for the characters in the current word
             Map<Character, Integer> wordFrequency = new HashMap<>();
             for (char c : word.toCharArray()) {
                 wordFrequency.put(c, wordFrequency.getOrDefault(c, 0) + 1);
             }
 
             // Check if the word can be formed using the characters in `chars`
             boolean canFormWord = true;
             for (Map.Entry<Character, Integer> entry : wordFrequency.entrySet()) {
                 char key = entry.getKey();
                 int count = entry.getValue();
                 if (charsFrequency.getOrDefault(key, 0) < count) {
                     canFormWord = false;
                     break;
                 }
             }
 
             // If the word can be formed, add its length to the counter
             if (canFormWord) {
                 counter += word.length();
             }
         }
 
         return counter;
    }
}
