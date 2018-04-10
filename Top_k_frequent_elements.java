// Goal is to find the top-K frequent elemnts given an array as an input.

// My appraoch to this problem is to iterate through the whole array and record the frequency in a hashMap.
// Then itearte through hashMap to get the top K frequent elements.

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        List<Integer> list = new ArrayList<>();
        //Map to store the key-value pairs.
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the Array and find the frequency of each element.
        for(int i=0;i<nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.replace(nums[i], map.get(nums[i])+1);
            
        }
        
        //Create an iteartor, find the max elemnt and add it to list. Delete it from HashMap.
        int p=0;
        int max =Integer.MIN_VALUE;
        int maxVal = 0;
        while(p < k)
        {
            
            for(Map.Entry<Integer, Integer> entry: map.entrySet())
            {
                int key = entry.getKey();
                int val = entry.getValue();
                if(val > maxVal)
                {
                    max = key;
                    maxVal = val;
                }
            }
            list.add(max);
            map.remove(max);
            maxVal = Integer.MIN_VALUE;
            p++;
        }
        // Return the list calculated.
        return list;
    }
}
