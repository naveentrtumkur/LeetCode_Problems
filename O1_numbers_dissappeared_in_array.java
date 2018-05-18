class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Create a list that is needed to store dissappeared elements.
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        
        for(int i=0;i<len;i++)
        {
            int val = Math.abs(nums[i]) -1;
            if(nums[val] > 0)
                nums[val] = -nums[val];
        }
        
        for(int i=0;i<len;i++)
        {
            if(nums[i] > 0)
                list.add(i+1);
        }
        
        return list;
    }
}
