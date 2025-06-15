class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(); 
        int tLen = t.length();
        int lastIndex = -1; 
        if ( sLen > tLen ){
            return false;
        }
        for ( int i =0; i<sLen; i++ ){
            char currentChar = s.charAt(i);
            // Instead of indexOf from start every time, search from lastIndex + 1
            lastIndex = t.indexOf(currentChar, lastIndex + 1);  
            
            if (lastIndex == -1) {
                return false;  
            }
        }
        return true;
    }
}