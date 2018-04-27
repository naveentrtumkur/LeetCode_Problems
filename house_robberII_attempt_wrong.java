// Dynamic programming solution

class Solution {
    public int rob(int[] nums) {
        int[] res = new int[nums.length];
        
        if(nums.length ==0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];
        
        res[0] = nums[0];
        res[1] = Math.max(nums[1], res[0]);
        
        //loop from i=2 to n and find teh max robbery amount.
        for(int i=2; i<nums.length; i++)
        {
            //do not rob or rob the current house
            res[i] = Math.max(res[i-1], nums[i] + res[i-2]);
            
        }
        
        return Math.max(res[nums.length -1] - nums[0], res[nums.length-1] - nums[nums.length-1]);
    }
}
