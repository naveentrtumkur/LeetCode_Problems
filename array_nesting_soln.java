//Using a visited array to store the intermediate result.

// Using an array to refer to as visited while getting the max count of indexed array elements.
class Solution {
    public int arrayNesting(int[] nums) {
        int maxRes = 0;
        boolean[] visited = new boolean[nums.length];
        
        //Traverse through the array Elements 
        for(int i=0; i<nums.length; i++)
        {
            
            if(!visited[i])
            {
                int count =0, index = nums[i];
                //int 
                do
                {
                    
                    count++;
                    index = nums[index];
                    visited[index] = true;
                    
                    
                }
                while(index!=nums[i]);
                
                maxRes = Math.max(maxRes,count);
            }
            
        }
        
        return maxRes;
    }
}
