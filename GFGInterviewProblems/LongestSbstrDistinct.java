package GFGInterviewProblems;

import java.util.HashSet;

public class LongestSbstrDistinct {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxNumber = 0;
        for ( int i=0; i<s.length(); i++ ){
            HashSet<Character> letters = new HashSet<Character>();
            for ( int j=i; j<s.length(); j++ ){
                if ( !letters.contains(s.charAt(j)) ){
                    letters.add(s.charAt(j));
                    maxNumber = Math.max( maxNumber, letters.size() );
                } else {
                    break;
                }
            }
        }
        
        return maxNumber;
        
    }
}
