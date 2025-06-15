// can be found on https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n^2) thus, worked for some cases but not for all ( time limit exceeded )
// I then optimized it using a different approach
// Runtime 2 ms Beats 74.92%  
// Memory 62.01 MB Beats 18.94%


import java.util.*;

class MaxProfit {
    public int maxProfit(int[] prices) {
        // int n = prices.length; 
        // int maxProfit =0; 
        // for ( int i=0; i<n-1; i++ ){
        //     for (  int k = i+1; k<n ; k++){
        //         maxProfit = Math.max( maxProfit , prices[k] - prices[i] );
        //     }
        // }
        // return maxProfit; 

        int n = prices.length; 
        int buy = prices[0]; 
        int maxProfit =0; 
        for ( int i=0; i<n; i++ ){
            // a different approach to reduce complexity
            // if it is less then the initial value of buy then we should consider buying that day 
            if ( prices[i] < buy ){
                buy = prices[i] ;
            } else  {
                // otherwise, we should be selling 
                maxProfit = Math.max(maxProfit,  prices[i] - buy ) ;
            }
            

        }
        return maxProfit; 
    }
}