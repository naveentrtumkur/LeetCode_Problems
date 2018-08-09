/**

Algorithm: 
        //f[k, day] represents the max profit up until prices[day] {Not including prices[day]} using at most k transactions. 
        // f[k, day] = max(f[k, day-1], prices[day] - prices[j] + max(f[k-1, j])) { j in range of [0, d-ay1] }
        //          = max(f[k, day-1], prices[day] + max(f[k-1, j] - prices[j]))
        // f[0, day] = 0; 0 times transation makes 0 profit
        // f[k, 0] = 0; if there is only one price data point you can't make any money no matter how many times you can trade
*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length<=1) //Base case checking
            return 0;
        int k =2;
        
        // Create a Dp array to store the profits till day i.
        int[][] dp = new int[k+1][prices.length];
      
        for(int transNo =1; transNo<=k ;transNo++){
            int maxProfitBeforeSell = Integer.MIN_VALUE;
            for(int day = 1; day<prices.length; day++){
                int profitOnPrevDay = dp[transNo][day-1];
                int maxProfit = Integer.MIN_VALUE;
                maxProfitBeforeSell = Math.max(maxProfitBeforeSell, dp[transNo-1][day-1]-prices[day-1]);
                dp[transNo][day] = Math.max(profitOnPrevDay, maxProfitBeforeSell+prices[day]);
            }
        }
        
        return dp[k][prices.length-1];
    }
}
