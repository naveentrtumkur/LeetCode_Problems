// Using Greedy approach to find the maximum Xor result.
// O(n) Solution using the greedy approach.
class Solution {
    public int findMaximumXOR(int[] nums) {
        
        int maxRes = 0;
        int mask = 0;
        
        // Use greedy approach, i.e iterate from 31st bit till oth bit.
        for(int i=31; i>=0; i--)
        {
            //Calculate the mask value at thi stage.
            mask = mask | (1<<i);
            
            //Create a HashSet and add the max value,
            Set<Integer> set = new HashSet<>();
            
            for(int n:nums)
            {
                //We are concerned only about the left part
                set.add(n & mask);
            }
            
            //Our greed is to find an element with the next bit set.
            int temp = maxRes | (1<<i);
            for(int val:set)
            {
                if(set.contains(val^temp))
                {
                    //Once you find teh greedy value, you can assign it and break out from the loop
                    maxRes = temp;
                    break;
                }
            }
        }
        
        //Finally return the maximum result that is calculated.
        return maxRes;
        
    }
}
