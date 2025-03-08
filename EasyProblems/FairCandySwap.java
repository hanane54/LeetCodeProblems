// Runtime 215ms Beats 16.51%
// Memory 45.94MB Beats 58.79%


class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // calculate the sum of candies in bob's 
        // calculate the sum of candies in alice's
        // check index by index if we exchange the boxes, would it give the same sum 

        // no initial checks on the arrays, since according to the description, they certainly have a different number of candies
        // int difference = giveSumOfCandies(aliceSizes) - giveSumOfCandies(bobSizes);
        int sumCandiesAlice = giveSumOfCandies(aliceSizes) ;
        int sumCandiesBob = giveSumOfCandies(bobSizes) ;
        for ( int i=0; i<aliceSizes.length; i++ ){
            for ( int j=0; j<bobSizes.length; j++ ){
                int newSumAlice = sumCandiesAlice - aliceSizes[i] + bobSizes[j]  ;
                int newSumBob = sumCandiesBob - bobSizes[j] + aliceSizes[i] ;
                if ( newSumAlice == newSumBob ){
                    return new int[] { aliceSizes[i], bobSizes[j] };
                }
            }
        }


        return new int[]{0, 0};
    }

    public int giveSumOfCandies( int[] boxes ){
        int sum =0;
        for ( int i = 0; i<boxes.length; i++ ){
            sum = sum+boxes[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        FairCandySwap solution = new FairCandySwap();
        
        // Test Case 1
        int[] aliceSizes1 = {1, 1};
        int[] bobSizes1 = {2, 2};
        int[] result1 = solution.fairCandySwap(aliceSizes1, bobSizes1);
        System.out.println("Test Case 1:");
        System.out.println("Expected: [1, 2]");
        System.out.println("Actual: [" + result1[0] + ", " + result1[1] + "]");
        
        // Test Case 2
        int[] aliceSizes2 = {1, 2};
        int[] bobSizes2 = {2, 3};
        int[] result2 = solution.fairCandySwap(aliceSizes2, bobSizes2);
        System.out.println("\nTest Case 2:");
        System.out.println("Expected: [1, 2]");
        System.out.println("Actual: [" + result2[0] + ", " + result2[1] + "]");
        
        // Test Case 3
        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1, 3};
        int[] result3 = solution.fairCandySwap(aliceSizes3, bobSizes3);
        System.out.println("\nTest Case 3:");
        System.out.println("Expected: [2, 3]");
        System.out.println("Actual: [" + result3[0] + ", " + result3[1] + "]");
    }
}