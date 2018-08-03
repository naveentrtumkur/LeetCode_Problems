// You can solve this problem using Dynamic Programming.

// Analyze for small inputs to come up with recurrence..
// n=1 return that number, n=2 return max of three.
// For n =3, you will return sum of first and third number or the max value among first and second.

// f(n) = Math.max(f(i-2) + nums[i] , f(i-1))

//Time :O(n)
//Space : O(1)

class Solution {
    public int rob(int[] nums) {
        int max_prev = 0, max_cur = 0; //Max prev value and Max curr value
        for(int x : nums)
        {
            int temp_max = max_cur; //Hold the cur_max in a variable so that it can later  be assigned as prev max value
            
            max_cur  = Math.max(max_prev + x, max_cur);
            
            max_prev = temp_max;
        }
        
        return max_cur; //return the current maximum value.
    }
}
