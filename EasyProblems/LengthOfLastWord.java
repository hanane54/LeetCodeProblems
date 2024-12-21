// returns the length of the last word in the given string 
// words are splitted by whitespaces
public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] wordsArray = s.split("\\s+");
        if (s.length() >= 1 && 104 >= s.length() && wordsArray.length != 0) {
            return wordsArray[wordsArray.length - 1].length();
        }
        return -1;
    }

    public static void main(String[] args) {
        lengthOfLastWord solution = new lengthOfLastWord();

        // Test case 1
        String s1 = "Hello World";
        int result1 = solution.lengthOfLastWord(s1);
        System.out.println("Test Case 1 Output: " + result1); // Expected: 5

        // Test case 2
        String s2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(s2);
        System.out.println("Test Case 2 Output: " + result2); // Expected: 4

        // Test case 3
        String s3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(s3);
        System.out.println("Test Case 3 Output: " + result3); // Expected: 6

        // Additional test case
        String s4 = "a";
        int result4 = solution.lengthOfLastWord(s4);
        System.out.println("Test Case 4 Output: " + result4); // Expected: 1
    }
}
