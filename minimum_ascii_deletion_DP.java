// Given two strings, calculate the minimum ascii value to be deleted to get two eaual strings.
// Im using top-down approach.

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int m = s1.length();
        int n = s2.length();
        // Calculate and fill the first column values.
        for(int i=1;i<=m; i++)
        {
            dp[i][0] = s1.charAt(i-1) + dp[i-1][0];
        }
        
        //calculate and fill the first row.
        for(int j=1; j<=n; j++)
        {
            dp[0][j] = s2.charAt(j-1) + dp[0][ j-1];
        }
        
        // Now we need to calculate the remaining values of teh dp table.
        // checking if the two chars are equal or not.
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    // No need to delete any charcters.
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                {
                    // Minimum ascii to be deleted will be calculated at each step. 
                    dp[i][j] = Math.min( dp[i-1][j] + s1.charAt(i-1) , dp[i][j-1] + s2.charAt(j-1));
                }
            }
        }
        //dp[m][n] would contain the minimum ascii to be deletd
        return dp[m][n];
    }
}
