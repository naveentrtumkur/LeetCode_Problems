// Find the length of longest palindromic subsequence.
// Dynamic Porgramming solution. Bottom-up approach

// Recurrence: dp[i][j] represents LPS where i= left index and j=right index.
// Dp[i][j] = { dp[i+1][j-1] + 2 if charAt(i) == charAt(j)
//            { Max(dp[i+1][j], dp[i][j-1]

// take care to init diagonals to 1.

//Space : O(2*n) ~O(n)  Time:O(n2)

class Solution {
    public int longestPalindromeSubseq(String s) {
        
        //Declare a 2D Dp array.
        int[][] dp = new int[s.length()][s.length()];
        
        // Use the recurrence to solve the problem.
        for(int i=s.length()-1; i>=0;i--)
        {
            dp[i][i] = 1; //Initialize diagional/same character lengths to 1.
            for(int j=i+1; j < s.length();j++) //Lopp from j=i+1 to len(s)
            {
                //if the characters are the same then increment dp[i][j] by prev +2
                if(s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i+1][j-1] + 2;
                else
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]); //Recurse to get the max length by omitting char @i or char @j
            }
        }
        
        //return the max length subsequence
        return dp[0][s.length()-1];
    }
}
