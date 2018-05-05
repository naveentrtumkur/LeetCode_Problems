// Recursive solution, making use of turn for player-1 and player-2.
// O(2^n) time complexity
// O(n)  space complexity.

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;
        
        return PredictRecurse(nums, 0, nums.length-1,1) >=0;
    }
    
    public int PredictRecurse(int[] nums, int s, int e, int turn)
    {
        // If s == e return the value
        if( s == e)
            return turn*nums[s];
        
        int a = turn*nums[s] + PredictRecurse(nums,s+1,e,-turn);
        int b = turn*nums[e] + PredictRecurse(nums,s,e-1, -turn);
        
        return turn*Math.max(turn*a,turn*b);
    }
}
