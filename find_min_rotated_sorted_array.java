class Solution {
    public int findMin(int[] nums) {
        // Initialise the first element as minimum, assuming no rotation is there.
        int min = nums[0];
        
        //loop from 1 to n, if any number less than min then that's the min so return that.
        //Else return min after traversing all number in nums.
       // Time complexity: O(n)
        
        for(int i=1; i<nums.length; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
                break;
            }
        }
        
        //Return the calculated minimum value.
        return min;
    }
}
