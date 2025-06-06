// works but so limited, time complexity is high
// can be found on https://leetcode.com/problems/plus-one/submissions/1654093401/

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder("");
        for ( int i=0; i<digits.length; i++ ){
            sb = sb.append( digits[i] );
        }
        int integerValue = Integer.parseInt(sb.toString())+1;
        String stringOfFinal = String.valueOf(integerValue);
        int[] arr = new int[stringOfFinal.length()];
        for ( int i=0; i<arr.length; i++ ){
           arr[i] = Character.getNumericValue(stringOfFinal.charAt(i));
        }
        return arr;
    }
}