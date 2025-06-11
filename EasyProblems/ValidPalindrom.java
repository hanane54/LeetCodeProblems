
class ValidPalindrom {
    public boolean isPalindrome(String s) {
        int fromLeft = 0;
        int fromRight = s.length()-1;
        while ( fromLeft<fromRight ){
            while (  fromLeft<fromRight && !Character.isLetterOrDigit(s.charAt(fromLeft))  ){
                fromLeft++;
            }
            while (fromLeft<fromRight && !Character.isLetterOrDigit(s.charAt(fromRight))  ){
                fromRight--;
            }
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