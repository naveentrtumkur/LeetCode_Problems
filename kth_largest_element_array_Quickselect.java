// Even better approach using quickselection.
// Time complexity is O(n)
// We choose pivot to be the middle value. Keep dividing array by half.
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //if(nums.length == k)
          //  return nums[nums.length-1];
        int pos =0;
            pos = quickselection(nums, nums.length - k+1,0,nums.length-1);
        return pos;
            
    }
    
    public int quickselection(int[] nums,int k, int start, int end)
    {
        int l = start, r = end; int pivot = nums[(l+r)/2];
        while(l<=r)
        {
            
            while(nums[l]<pivot)
                l++;
            while(nums[r]>pivot)
                r--;
            if(l>=r)
                break;
            swap(nums,l++,r--);
            
        }
        
        if(l-start+1 > k)
            return quickselection(nums,k,start,l-1);
        if(l==r && l-start+1==k)
            return nums[l];
        
        //recursive call by updating start position and k accordingly.
        return quickselection(nums, k-r+start-1, r+1,end);
        
        
    }
    public void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
