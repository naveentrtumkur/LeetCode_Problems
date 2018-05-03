// This problem can be solved by critically analyzing following two aspects:
//1. When we can buy a stock
//2, When can we sell a stock and cooldown.
// You csn solve this using buy[] and sell[] array, but through careful inspection you can 
// solve this in O(1) space complexity.

class Solution {
    public int maxProfit(int[] prices) {
        //Base case
        if(prices == null || prices.length < 1)
            return 0;
        
        //Initiliase buy and sell variables accordingly.
        int b0 = -prices[0], b1 = b0;
        int s0 = 0, s1 = 0, s2 = 0;
        
        //Start iterating from i=1 till n
        for(int i=1;i<prices.length;i++)
        {
            // Check max current value that can be bought
            b0 = Math.max(b1, s2 - prices[i]);
            
            //check the maximum current value that can be sold
            s0 = Math.max(s1, b1 + prices[i]);
            
            //re-initialize the variables.
    	    b1 = b0; s2 = s1; s1 = s0; 
        }
        
        //returning the last but 1 sold value.
        return s1;
    }
}
