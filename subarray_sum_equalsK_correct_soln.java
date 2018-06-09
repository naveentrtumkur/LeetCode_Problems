// Subarray sum = K
// Solution using a HashMap and stporing the sum values.
// store the current value and further sum in a HashMap.


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int total =0;
        map.put(0,1);
        
        int sum =0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(map.containsKey(sum-k))
                total += map.get(sum - k);
            
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        
        return total;
    }
}
