/*
There is a room with n lights which are turned on initially and 4 buttons on the wall. After performing exactly m unknown operations towards buttons, you need to return how many different kinds of status of the n lights could be.

Suppose n lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:

Flip all the lights.
Flip lights with even numbers.
Flip lights with odd numbers.
Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...
Example 1:
Input: n = 1, m = 1.
Output: 2
Explanation: Status can be: [on], [off]
Example 2:
Input: n = 2, m = 1.
Output: 3
Explanation: Status can be: [on, off], [off, on], [off, off]

*/



//Observe the pattern and reduce the number of possibilities to only 3.
// actually the first three possibilities uniquely form other options
// changing m values yield differnet answers.

class Solution {
    public int flipLights(int n, int m) {
        // We can infer that n value is as it is if <3 else we can take 3 into considern
        
        n = Math.min(n,3);
        // If m==0, only 1 possibility
        if(m==0)
            return 1;
        
        //IF m==1, two possibility
        if(m==1)
            return n==1?2:n==2?3:4;
        
        //If m==2 then there are other possibilities.
        if(m==2)
            return n==1?2:n==2?4:7;
        
        //If m==3 then there are other cases.
        if(m==3)
            return n==1?2:n==2?4:8;
        
        //We can choose from all possible values if m>3
        return n==1?2:n==2?4:8;
        
    }
}
