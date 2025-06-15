// can be found on https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
// Runtime 0 ms Beats 100.00%
// Memory 41.34 MB Beats 86.19%



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