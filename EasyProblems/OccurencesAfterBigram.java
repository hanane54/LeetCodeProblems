// Runtime 2ms Beats 9.55%
// Memory 41.71MB Beats 40.57%
import java.util.ArrayList;

public class OccurencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] splittedWords = text.split("\\W+");
        ArrayList<String> wordSet = new ArrayList<>();
        for ( int i=0; i<splittedWords.length-2; i++ ){
            if ( splittedWords[i].equals(first) && splittedWords[i+1].equals(second) ){
                wordSet.add(splittedWords[i+2]);
            }
        }
        int n = wordSet.size(); 
        String[] result = new String[n]; 
  
        int i = 0; 
        for (String element : wordSet) 
            result[i++] = element; 

        return result;
    }
    public static void main(String[] args) {
        OccurencesAfterBigram solution = new OccurencesAfterBigram();
        
        // Test Case 1
        String text1 = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
        String first1 = "kcyxdfnoa";
        String second1 = "jkypmsxd";
        String[] result1 = solution.findOcurrences(text1, first1, second1);
        System.out.println("Test Case 1:");
        System.out.println("Input: text = \"" + text1 + "\", first = \"" + first1 + "\", second = \"" + second1 + "\"");
        System.out.print("Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print("\"" + result1[i] + "\"");
            if (i < result1.length - 1) System.out.print(",");
        }
        System.out.println("]");
        
        // Test Case 2
        String text2 = "we will we will rock you";
        String first2 = "we";
        String second2 = "will";
        String[] result2 = solution.findOcurrences(text2, first2, second2);
        System.out.println("\nTest Case 2:");
        System.out.println("Input: text = \"" + text2 + "\", first = \"" + first2 + "\", second = \"" + second2 + "\"");
        System.out.print("Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print("\"" + result2[i] + "\"");
            if (i < result2.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
} 
    