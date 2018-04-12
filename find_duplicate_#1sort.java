// Naive solution is to sort the array and rcompare every neighbouring elemnts.
// If a duploicate is found then return that element.

// Proof usign pigeon hole principle.

class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
                return nums[i];
        }
        
        //if there wasn't any match found, return -1;
        return -1;
        
    }
}
