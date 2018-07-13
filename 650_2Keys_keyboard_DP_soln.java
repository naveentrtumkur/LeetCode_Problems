// DP solution to approach this problem.

// minimum operations reqd to solve this problem would be pasting A everytime or findign the greatest prime factor.
// Time : O(n^2)
//Space O(n)

class Solution {
    public int minSteps(int n) {
       //Intialize a dp array of size n+1;
        int[] dp = new int[n+1];
        dp[1] = 0;
        
        for(int i=2; i<=n; i++) //loop from i=2 to n+1
        {
            dp[i] = i; //Pasting one char @ a time.
            for(int j=i-1;j>1;j--)
            {
                //check if the number is non-prime..
                if(i%j == 0)
                {
                    dp[i] = dp[j] + (i/j); // (i/j - 1) for pasting
                    // +1 for copying. So toal i/j steps
                    break; //Efficient result found, no need to proceed
                }
            }
        }
        
        return dp[n]; //Return teh min operations required.
    }
}
