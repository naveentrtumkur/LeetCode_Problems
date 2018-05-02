// Dp approach to solve this particular problem.
// sell[] and buy[] are two array being used to approach this probelm.
// You can either sell or buy or contin ue holding the stock at any point of time
// The fee can be applied while selling or during buying only.

class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int len = prices.length;
        int[] buy = new int[len];
        int[] sell = new int[len];
        
        //you will buy the first stock.
        buy[0] = -prices[0] - fee; // apply a fee while buying a stock

        //you cannot sell teh first stock. so mark its value to be zero.
        sell[0] = 0;
        
        for(int i=1;i<len;i++)
        {
            // Check whether the stock can be bought on a day
            buy[i] = Math.max(buy[i-1], sell[i-1] - prices[i] - fee); // fee applied while buying a stcok.
            
            //check whether the stock
            sell[i] = Math.max(sell[i-1], buy[i-1] +prices[i]);
        }
        
        return sell[len-1];
        
    }
}
