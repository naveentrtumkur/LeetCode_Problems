// The logic is to check the maximum from 0 to n-1 and 1 to n-2 and return and return the maximum robbery that can be made from this.
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 )
            return 0;
        if(nums.length ==1)
            return nums[0];
        
        return Math.max(robbing(nums,0,nums.length-1, new int[nums.length]),robbing(nums,1,nums.length, new int[nums.length]));
    }
    
    // A function to calculate the maximum robbery that can be made.
    public int robbing(int[] nums, int start, int end, int[] robs)
    {
        //If the starting index is from 0.
        if(start == 0)
        {
            robs[0] = nums[0];
            robs[1] = Math.max(nums[0],nums[1]);
            
        }
        
        //Else if the starting index is from 1.
        else
        {
            robs[1]  =nums[1];
        }
        for(int i=2;i<end;i++)
        {
            robs[i] = Math.max(robs[i-1], robs[i-2] + nums[i]);
        }
        //System.out.println("start="+start+" "+robs[end-1]);
        return robs[end-1];
    }
}
