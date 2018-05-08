//Binary search solution.
// Complexity O(logn) / O(n) -- worst case

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low<high) //loop till low<high, it breaks as soon as low == high or low>high        
        {
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[high]) //nums[mid] is lowest in right side. check left side elements.
                high = mid;
            else if(nums[mid] > nums[high]) //nums[mid] is greater element, check righter portion
                low = mid + 1;
            else //duplicate entries, so decrement high.
            {
                high--;
            }
        }
        
        //You need to return nums[low] -- the  lowest element
        return nums[low];
    }
}
