//Dynamic programming solution, there are two possible solutions
// 1. Sell the stock or continue holding
// 2. Buy the stock or continue holding the stock.

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cost = 0, hold = -prices[0];
        //At stage i+1, you can either buy or sell the stock. You cannot do both.
        for(int i=1;i<prices.length;i++)
        {
            //you can sell or continue with existing stock.
            cost = Math.max(cost, hold + prices[i] - fee); // care must be taken to see fee is charged only while selling.
            
            //you can buy or continue with existing stock.
            hold= Math.max(hold, cost - prices[i] );
        }
        
        return cost;
    }
}
