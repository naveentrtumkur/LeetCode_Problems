// Time limit exceeded
//Brutefprce O(n2) runtime.
class Solution {
    public int findMaximumXOR(int[] nums) {
        if(nums == null || nums.length ==0 )
            return 0;
        if(nums.length ==1)
            return nums[0]^nums[0];
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int cur = nums[i]^nums[j];
                if(cur>max)
                    max = cur;
            }
        }
        return max;
        
    }
}
