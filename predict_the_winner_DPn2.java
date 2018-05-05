//Dynamic programming solution

// Recursion: dp[i][j] = Math.max(nums[i] - dp[i+1][j], nums[j] - dp[i][j-1])

//Time complexity: O(n2)
//Space complexity: O(n2)



class Solution {
    public boolean PredictTheWinner(int[] nums) {
        //Declare the DP array.
        int[][] dp = new int[nums.length+1][nums.length];
        
        for(int s=nums.length-2;s>=0;s--)
        {
            for(int e= s+1; e<nums.length;e++)
            {
                int a = nums[s] - dp[s+1][e];
                int b = nums[e] - dp[s][e-1];
                dp[s][e] = Math.max(a,b);
                
            }
            
        }
        //Return the final calculated answer.
        return dp[0][nums.length-1]>=0;
    }
}
