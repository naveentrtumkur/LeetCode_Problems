//Use additional space to solve this problem.
//Use a hashSet to solve this problem.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> set = new hashSet<>();
        //Create a new list that would store elements.
        int len = nums.length;
        
        for(int i=0;i<len;i++)
        {
            if(!set.contains(nums[i]))
                set.add(nums[i]);
        }
        
    }
}
