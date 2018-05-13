/******

Problem statement.

On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3]

*****/

//Use Dynamic programming to sol ve this in O(n) time complexity.
// Recurrence: dp[i] = min(dp[i-1]+nums[i], dp[i-2]+nums[i])

//O(n) Space Complexity And O(n) time complecity.

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if(cost == null || cost.length ==0)
            return 0;
        if(cost.length ==1)
            return cost[0];
        //Declare a Dp array to store the intermittant
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<cost.length;i++)
        {
            dp[i] = cost[i]+Math.min(dp[i-2],dp[i-1]);
            
        }
        
        //Return the minimum i.e dp[n] or dp[n-1];
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
    
}
