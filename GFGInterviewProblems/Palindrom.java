class Palindrom {
    public boolean isPalindrome(String s) {

        int start = 0; 
        int end = s.length()-1;

        while( start < end ){
           
            // Skip non-alphanumeric characters from left
            while (start < end && !isAlphanumeric(s.charAt(start))) {
                start++;
            }
            // Skip non-alphanumeric characters from right
            while (start < end && !isAlphanumeric(s.charAt(end))) {
                end--;
            }
           
            if (isAlphanumeric(s.charAt(start)) && isAlphanumeric(s.charAt(end)) &&  Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) ){
                return false;
            }
            start++;
            end--;

        }
        return true;

    }
    public boolean isAlphanumeric(char c) {
    return (c >= 'a' && c <= 'z') || 
           (c >= 'A' && c <= 'Z') || 
           (c >= '0' && c <= '9');
}
}