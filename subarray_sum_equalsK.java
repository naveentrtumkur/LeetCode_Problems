//Atttempt #1

// Subarray sum = K

// store the current value and further sum in a HashMap.


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int total =0;
        
        int sum =0;
        
        for(int i= nums.length-1; i>=0;i--)
        {
            sum += nums[i];
            map.put(i,sum);
        }
        
        for(int i=0; i<nums.length;i++)
        {
            int temp = map.get(i) - k;
            
            if(map.containsValue(temp))
            {
                total+=1;
                i += map.
            }
        }
        return total;
    }
}
