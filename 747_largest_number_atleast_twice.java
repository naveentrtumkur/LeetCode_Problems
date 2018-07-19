// My approach would be to solve in O(2n) ~ O(n) time.

// 1. In first pass scan to find the maximum element.
// 2. Do a second pass such that:
//  - If there's any value > 2*max return -1.
//  - Else you can return the max_element_index

class Solution {
    public int dominantIndex(int[] nums) {
        int max_elem_index = 0;
        
        //First pass to find the maximum element
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > nums[max_elem_index])
                max_elem_index = i;
        }
        
        //Second pass to find if condn satisfied or not.
        for(int i=0;i<nums.length;i++)
        {
            if(i!=max_elem_index && nums[max_elem_index] < (nums[i] *2) )
                return -1;
            
        }
        
        return max_elem_index; //return the max element index.
    }
}
