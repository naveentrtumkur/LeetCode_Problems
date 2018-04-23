// Solution using O(n2logn) tim ecomplexity and (Onlogn) space

class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length, total=0;
        //Sort the input array.
        Arrays.sort(nums);
        
        for(int i=0; i<len-2;i++)
        {
            int k = i+2;
            for(int j=i+1;j<len-1 && nums[i]!=0;j++)
            {
                int x= nums[i] + nums[j];
                int k_val = binarySearch(nums,k,len-1,x);
                    total+= k_val-j-1;
            }
        }
        
        return total;
    }
    
    public int binarySearch(int[] nums, int l, int r, int x)
    {
        while(l<=r && r<nums.length)
        {
            int mid = (l+r)/2;
            
            if(nums[mid] < x)
                l = mid+1;
            else if(nums[mid]>=x)
                r = mid-1;
                    
        }
        return l;
    }
}
