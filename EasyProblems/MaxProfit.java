class MaxProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int maxProfit =0; 
        for ( int i=0; i<n-1; i++ ){
            for (  int k = i+1; k<n ; k++){
                maxProfit = Math.max( maxProfit , prices[k] - prices[i] );
            }
        }
        return maxProfit; 
    }
}