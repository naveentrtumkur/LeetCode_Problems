/*
Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.

However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.

*/

// Optimal Division problem. Calculate the best way to place braces such that we get maximum result.

class Solution {
    public String optimalDivision(int[] nums) {
        
        StringBuilder sb = new StringBuilder();
        
        // If only one value in nums return it.
        if(nums.length == 0)
            return sb.toString();
         sb.append(nums[0]);
         if(nums.length == 1)
            return sb.toString();
        
        if(nums.length == 2)
        {
            sb.append("/"+nums[1]);
            return sb.toString();
        }
            sb.append("/(");
        for(int i=1;i<nums.length-1;i++)
        {
            sb.append(nums[i]+"/");
        }
        
        sb.append(nums[nums.length-1]+")");
        // return after the final string is calculated.
        return sb.toString();
        
    }
}
