// Second approach without using the turn variable and by using memiosation technique.
//Storign the previous values that might be used later.
// Time complexity: O(n2)
// Space complexity: O(n2)


class Solution {
    public boolean PredictTheWinner(int[] nums) {

        if(nums == null || nums.length ==0 )
            return false;
        int[][] memo = new int[nums.length][nums.length];
        return winner(nums,0,nums.length-1,memo)>=0;
        
    }
    
    public int winner(int[] nums, int s, int e, int[][] memo)
    {
        if(s == e)
            return nums[s];
        
        //If the stored value is not null, siumply return it.
        if(memo[s][e]!=0)
            return memo[s][e];
        
        int a = nums[s] - winner(nums,s+1,e,memo);
        int b = nums[e] - winner(nums,s,e-1,memo);
        
        memo[s][e] = Math.max(a,b);
        
        return memo[s][e];
        
        
        
    }
}
