// Third approach using Floyd's tortoise and hare cycle detection algorithm

class Solution {
    public int findDuplicate(int[] nums) {
        
        int hare = nums[0];
        int tortoise = nums[0];
        
        do
        {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        while(nums[hare]!=nums[tortoise]);
            
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        
        while(ptr1!=ptr2)
        {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        //return teh value of ptr1;
        return ptr1;
    }
}
