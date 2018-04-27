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
        int preRob =0, preNotRob = 0, rob =0, notRob = 0;
        
        for(int i = start; i < end; i++)
        {
            //current rob = prevNotRObbed plus current nums[i] value
            rob = preNotRob + nums[i];
            
            //currently not robb is max of below two cases.
            notRob = Math.max(preRob,preNotRob);
            
            //change preRob and preNotRob accordingly.
            preRob = rob;
            preNotRob = notRob;
        }
        
        return Math.max(preRob,preNotRob);
    }
}
