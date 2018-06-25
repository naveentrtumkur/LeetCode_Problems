class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] dp = new boolean[nums.length];
        if(nums.length == 0)
            return true;
        
        for(int i=0;i<nums.length-1;i++)
        {
            int temp = nums[i];
            for(int j=0;j<i+temp;j++)
            {
                //if(j == nums.length-1 && dp[j])
                  //  return true;
                if(j==nums.length-1 && !dp[j] && i!=j)
                    return true;
                if(dp[j])
                    continue;
                else
                    dp[j] = true;
            }
            
        }
        
        //return teh bool in last index.
        return dp[nums.length -1];
    }
}
