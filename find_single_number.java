// HashSet approach to solve the problem

class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
            {
                set.add(nums[i]);
            }
        }
        //Iterate through the hashset and push the elements onto a new array.
        int[] res = new int[set.size()];
        int i=0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            res[i++] = it.next();
        }
        
        return res;
    }
}
