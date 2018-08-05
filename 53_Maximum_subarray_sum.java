//Dynamic programming solution.
// Recurrence: max_sum(A,i) = max_sum(A, i-1) > 0 ? A[i] + dp[i-1] : 0 + A[i] // reset the previous sum
// Time: O(n) and space: O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; // Init the first element to be subarray_sum_0
        int max_val = nums[0]; //Init the max value to be the first element.
        
        for(int i=1; i< nums.length; i++)
        {
            //update dp[i] value suitably.
            dp[i] = ( dp[i-1]) > 0 ?(nums[i]+dp[i-1]): (0+nums[i]); //reset the subarray sum,.
            if(max_val < dp[i])
                max_val = dp[i];
        }
        return max_val; //Return the final value 
    }
}
