// Naive solution
// 1. Create a list to store elements which occur more than n/3 times.
// 2. Sort the input array 
// 3. If an element occurs more than n/3 times, add it to list.
// 4. At the end, return the list(with elements occuring more than n/3)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        //If nums is null or nums.length <3 return the list
        if(nums.length ==0)
            return list;
        
        //Sort the array
        Arrays.sort(nums);
        //Declare all the required variables.
        int prev =  nums[0];
        int count =1;
        int val = (int) (Math.floor(nums.length/3));
        //System.out.println("Ceil="+val);
        
        
        for(int i=1; i< nums.length; i++)
        {
            if(count > val)
                    list.add(prev);
            if(nums[i] == prev)
            {
                count++;
                
                continue;
            }
            
            count =1;
            prev = nums[i];
        }
        if(count > val && !list.contains(prev))
                    list.add(prev);
        //if(nums.length ==1)
        //    list.add(prev);
        //Return the final list.
        return list;
    }
}
