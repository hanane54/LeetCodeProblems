// can be found on https://leetcode.com/problems/valid-palindrome/
// Runtime 2ms Beats 98.89%
// Memory 43.22MB Beats 63.75%

class ValidPalindrom {
    public boolean isPalindrome(String s) {
        int fromLeft = 0;
        int fromRight = s.length()-1;
        while ( fromLeft<fromRight ){
            // skip the non alphanumeric from the left 
            while (  fromLeft<fromRight && !Character.isLetterOrDigit(s.charAt(fromLeft))  ){
                fromLeft++;
            }
            // skip non alphanumeric from the right
            while (fromLeft<fromRight && !Character.isLetterOrDigit(s.charAt(fromRight))  ){
                fromRight--;
            }
            // if they are not equal then it's not a palindrom 
            if (Character.toLowerCase(s.charAt(fromLeft)) != Character.toLowerCase(s.charAt(fromRight))){
                return false;
            } else {
                fromRight--;
                fromLeft++;
            }

        }
        return true;

    }
}