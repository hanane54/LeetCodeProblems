// note that we are not supposed to convert any representation, we are just counting the the number of
// set bits in its binary representation
// Runtime : 0ms Beats : 100.00%
// Memory : 41.29MB Beats : 8.76%
class HammingWeight {
    public int hammingWeight(int n) {
        int bitsInBinary = 0;
        int i;
        while ( n>=1 ){
            i=n % 2 ;
            bitsInBinary = bitsInBinary + i ;
            n = n / 2;
            if ( n==1 ){
                bitsInBinary = bitsInBinary + 1 ;
                break;
            }
        }
        
        return bitsInBinary;
    }

    public static void main(String[] args) {
        HammingWeight solution = new HammingWeight();
        
        // Test Case 1: n = 11
        int test1 = 11;
        System.out.println("Test Case 1:");
        System.out.println("Input: n = " + test1);
        System.out.println("Expected Output: 3");
        System.out.println("Actual Output: " + solution.hammingWeight(test1));
        System.out.println();
        
        // Test Case 2: n = 128
        int test2 = 128;
        System.out.println("Test Case 2:");
        System.out.println("Input: n = " + test2);
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + solution.hammingWeight(test2));
        System.out.println();
        
        // Test Case 3: n = 2147483645
        int test3 = 2147483645;
        System.out.println("Test Case 3:");
        System.out.println("Input: n = " + test3);
        System.out.println("Expected Output: 30");
        System.out.println("Actual Output: " + solution.hammingWeight(test3));
    }
}