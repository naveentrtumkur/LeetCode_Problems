//Just loop through the array from every elemnt to it's complete cycle till u find next greater element.
// If not found assign -1 and return the newly formed array.

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // create an array to store next greater elements list.
        int[] nextGreat = new int[nums.length];
        if(nums.length ==0)
            return nextGreat;
        
       for(int i=0;i<nums.length;i++)
       {
           int max = nums[i];
           for(int j=1;j<nums.length;j++)
           {
               
               if(max < nums[(i+j)%nums.length])
               {
                   max = nums[(i+j)%nums.length];
                   break;
               }
               
               
           }
           
           //System.out.println("max ="+max);
           //System.out.println("nums[i]="+nums[i]);
           if(max !=nums[i])
               nextGreat[i] = max;
           else
               nextGreat[i] = -1;
       }
        
        return nextGreat;
    }
}
