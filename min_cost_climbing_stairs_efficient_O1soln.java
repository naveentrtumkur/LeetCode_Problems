//Use Dynamic programming to sol ve this in O(n) time complexity.
// Recurrence: dp[i] = min(dp[i-1]+nums[i], dp[i-2]+nums[i])

//O(1) Space Complexity And O(n) time complecity.

class Solution { 
    public int minCostClimbingStairs(int[] cost) {
        
        int f0, f1 = cost[0], f2 = cost[1];
        for(int i=2;i<cost.length;i++)
        {
            //dp[i] = cost[i]+Math.min(dp[i-2],dp[i-1]);
            f0 =  Math.min(f1,f2) + cost[i];
            f1 = f2;
            f2 = f0;
            
        }
        
        //return Math.min(dp[cost.length-1],dp[cost.length-2]);
        return Math.min(f1,f2);
    }
    
}
