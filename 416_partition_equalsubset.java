//This probelm is similar to 0/1 knapsack problem... 

class Solution {
  public boolean canPartition(int[] nums) {
    int sum = 0; //to calculate the sum of numbers..
    
    for (int num : nums) {
        sum += num;
    }
    
    if ((sum & 1) == 1) {
        return false; //If the sum is odd return false straightaway...
    }
    sum /= 2; // Check for half-the-sum...

    int n = nums.length; //n-value would be equal to nums.length...
    boolean[][] dp = new boolean[n+1][sum+1]; //create a boolean DP array of size n+1 x sum+1
    for (int i = 0; i < dp.length; i++) {
        Arrays.fill(dp[i], false); //Entire dp should be filled with false.
    }
    
    dp[0][0] = true; // Fill true in first row and first column..
    
    for (int i = 1; i < n+1; i++) {
        dp[i][0] = true; //Entire first column. with true.
    }
    for (int j = 1; j < sum+1; j++) {
        dp[0][j] = false; //Entire first row with true...
    }
    
    // Check for other elements now...
    for (int i = 1; i < n+1; i++) {
        for (int j = 1; j < sum+1; j++) {
            dp[i][j] = dp[i-1][j];
            if (j >= nums[i-1]) {
                dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]); //0/1 knapsack condition...
            }
        }
    }
   
    return dp[n][sum]; //return dp[n][sum] whether it's trrue or false...
}
}
