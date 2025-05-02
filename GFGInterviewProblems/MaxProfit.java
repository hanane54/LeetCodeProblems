package GFGInterviewProblems;

class MaxProfit {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;

        if ( n < 2 ){
            return maxProfit;
        }	
        
        for ( int i=0; i<n-1; i++ ){
            for ( int j=i+1; j<n; j++ ){
                maxProfit = Math.max( maxProfit, prices[j] - prices[i] );
            }
        }
        return maxProfit;
    }

    public static void main( String[] args ){
        MaxProfit mp = new MaxProfit();
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println( "Maximum Profit: " + mp.maximumProfit(prices) );
    }


}