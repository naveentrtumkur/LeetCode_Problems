// Find the distance between two consecutive ones.

// Approach: assign current max=0
// find 1-bit and next 1 bit. keep uodating the max value when the curr_max exceeds the max_value.

// O(n)  n is maxumum number of bits a number can have. Space: O(1)

class Solution {
    public int binaryGap(int N) {
        int max = 0, curr = 0; boolean prev1 = false, curr1 = false;
        for(int i=N;i>0;)
        {
            
            if((i&1)==1 )
            {
                max = Math.max(max, curr);
                //if(curr>0)
                curr = 0; //Re-assign curr to 0;
                prev1 = true, curr1 = true;
            }
            
            else if((i&1) == 0 && prev1)
            {
                curr++;
                curr1 = false;
            }
            
            i = i >> 1;
        }
        
        return max;
    }
}
