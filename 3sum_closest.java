// This is an O(n2) solution to solve the probelm.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // initialise result variable.
        int res = nums[0] + nums[1] + nums[nums.length-1];
        
        //sort the nums array
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length -2 ;i++)
        {
            int start = i+1, end = nums.length-1;
            while(start < end)
            {
                int sum = nums[i] + nums[start] + nums[end];
                //if the sum is greater than target, reduce the end position.
                //else incremenet the start position
                if(sum > target)
                    end--;
                else
                    start++;
                
               if(Math.abs(target - sum)  < Math.abs(target-  res))
                   res =  sum;
            }
            
            
        }
        
        return res;
    }
}
