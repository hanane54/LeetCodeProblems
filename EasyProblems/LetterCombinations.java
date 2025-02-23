// Runtime 6ms Beats 8.76% 
// Memory 42.48MB Beats 27.89%
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
    private HashMap<Character, String> phoneNumbers;
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        
        // Initialize the mapping
        phoneNumbers = new HashMap<>();
        phoneNumbers.put('2', "abc");
        phoneNumbers.put('3', "def");
        phoneNumbers.put('4', "ghi");
        phoneNumbers.put('5', "jkl");
        phoneNumbers.put('6', "mno");
        phoneNumbers.put('7', "pqrs");
        phoneNumbers.put('8', "tuv");
        phoneNumbers.put('9', "wxyz");
        
        List<String> results = new ArrayList<>();
        recursiveCall(digits, "", 0, results);
        return results;
    }
    
    private void recursiveCall(String digits, String currentCombination, int currentIndex, List<String> resultList) {
        // Base case: if we've processed all digits, add the combination
        if (currentIndex == digits.length()) {
            resultList.add(currentCombination);
            return;
        }
        
        // Get current digit and its corresponding letters
        char currentDigit = digits.charAt(currentIndex);
        String possibleLetters = phoneNumbers.get(currentDigit);
        
        // Try each possible letter for current digit
        for (char letter : possibleLetters.toCharArray()) {
            recursiveCall(digits, currentCombination + letter, currentIndex + 1, resultList);
        }
    }
    
    public static void main(String[] args) {
        LetterCombinations solution = new LetterCombinations();
        
        // Test Case 1: digits = "23"
        System.out.println("Test Case 1:");
        System.out.println("Input: \"23\"");
        System.out.println("Output: " + solution.letterCombinations("23"));
        
        // Test Case 2: digits = ""
        System.out.println("\nTest Case 2:");
        System.out.println("Input: \"\"");
        System.out.println("Output: " + solution.letterCombinations(""));
        
        // Test Case 3: digits = "2"
        System.out.println("\nTest Case 3:");
        System.out.println("Input: \"2\"");
        System.out.println("Output: " + solution.letterCombinations("2"));

        System.out.println("\nTest Case 4:");
        System.out.println("Input: \"75\"");
        System.out.println("Output: " + solution.letterCombinations("75"));
    }
}