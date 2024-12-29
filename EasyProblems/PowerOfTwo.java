// checks if a number is a power of two, I used algorithm function from Math
// the logic is to round the result of the log operation to down and up 
// if the two are equal, it means that the result is an integer, in this case, it is indeed a power of two


// This is not yet resolved !!!! To be finished later
class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // this commented section didn't actually work in case of large numbers
        //return  Math.floor( (Math.log(n) / Math.log(2)) ) ==  Math.ceil( (Math.log(n) / Math.log(2)) ) ;
        if (n <= 0) return false;
        double logResult = Math.log(n) / Math.log(2);
        // Round to 6 decimal places
        logResult = Math.round(logResult * 1000000.0) / 1000000.0;
        return Math.floor(logResult) == Math.ceil(logResult);
    }

    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();
        
        // Test case 1: n = 1 (2^0)
        int test0 = 536870912;
        boolean result0 = solution.isPowerOfTwo(test0);
        System.out.println("Testing number: " + test0);
        System.out.println("Is power of two? " + result0);

        // Test case 536870912: n = 1 (2^0)
        int test1 = 536870912;
        boolean result1 = solution.isPowerOfTwo(test1);
        System.out.println("Testing number: " + test1);
        System.out.println("Is power of two? " + result1);
        
        // Test case 2: n = 16 (2^4)
        int test2 = 16;
        boolean result2 = solution.isPowerOfTwo(test2);
        System.out.println("\nTesting number: " + test2);
        System.out.println("Is power of two? " + result2);
        
        // Test case 3: n = 3 (not a power of two)
        int test3 = 3;
        boolean result3 = solution.isPowerOfTwo(test3);
        System.out.println("\nTesting number: " + test3);
        System.out.println("Is power of two? " + result3);
    }
}
