// Runtime 2ms Beats 22.67%
// Memory 41.06MB Beats 24.98%

import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public boolean isHappy(int n) {
        if (n >= 1 && n <= (Math.pow(2, 31) - 1)) {
            // to detect cycles in the sequence
            // use a HashSet to keep track of numbers we have seen
            Set<Integer> seen = new HashSet<>();
            while (n > 1 && !seen.contains(n)) {
                seen.add(n);
                String string_number = Integer.toString(n);
                int sum = 0;
                for (int i = 0; i < string_number.length(); i++) {
                    sum = sum + Character.getNumericValue(string_number.charAt(i)) 
                          * Character.getNumericValue(string_number.charAt(i));
                }
                n = sum;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        int testNumber = 19;
        boolean result = solution.isHappy(testNumber);
        
        System.out.println("Testing number: " + testNumber);
        System.out.println("Is it happy? " + result);
        
        int testNumber1 = 2;
        boolean result1 = solution.isHappy(testNumber1);
        
        System.out.println("Testing number: " + testNumber1);
        System.out.println("Is it happy? " + result1);
    }
}