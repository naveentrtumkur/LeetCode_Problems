//Dynamic programming solution

// Recursion: dp[i][j] = Math.max(nums[i] - dp[i+1][j], nums[j] - dp[i][j-1])
// Instead of using n2 array u can use 1D array
//Time complexity: O(n2)
//Space complexity: O(n)



class Solution {
    public boolean PredictTheWinner(int[] nums) {
        //Declare the DP array.
        int[] dp = new int[nums.length];
        
        for(int s=nums.length-2;s>=0;s--)
        {
            for(int e= s+1; e<nums.length;e++)
            {
                int a = nums[s] - dp[e];
                int b = nums[e] - dp[e-1];
                dp[e] = Math.max(a,b);
                
            }
            
        }
        //Return the final calculated answer.
        return dp[nums.length-1]>=0;
    }
}
