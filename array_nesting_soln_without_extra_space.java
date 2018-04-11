// Solution without using a vissited array.
// Using an array to refer to as visited while getting the max count of indexed array elements.
// Assign the visisted array value to integer.max_value
class Solution {
    public int arrayNesting(int[] nums) {
        int maxRes = 0;
        //boolean[] visited = new boolean[nums.length];
        
        //Traverse through the array Elements 
        for(int i=0; i<nums.length; i++)
        {
            
            if(nums[i]!=Integer.MAX_VALUE)
            {
                int count =0, index = nums[i];
                //int 
                do
                {
                    
                    count++;
                    nums[i] = Integer.MAX_VALUE;
                    index = nums[index];
                    
                    
                    
                }
                while(index!=nums[i]);
                
                maxRes = Math.max(maxRes,count);
            }
            
        }
        
        return maxRes;
    }
}
