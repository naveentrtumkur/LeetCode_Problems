// To fin dthe max consecutive ones in a series of numbers.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0, maxCount =0;
        boolean prev = false;
        //Handle the base case.
        if(nums.length == 0)
            return maxLen;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                prev = true;
                maxCount++;
                if(maxCount > maxLen)
                    maxLen = maxCount;
            }
            else
            {
                prev = false;
                maxCount = 0;
            }
        
        }
        return maxLen;
    }
}
