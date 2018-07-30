// We need to come up with a DP approach.
/*
In our context dp[i][j] would be the max difference stones a person can pick to maximize winning chance.
A person can pick piles[i] or piles[j].

If he picks piles[i], result will be piles[i] - dp[i + 1][j] //second person picking this i+1 to j
If he pick piles[j], result will be piles[j] - dp[i][j - 1] //second person picking from i to j-1

The recurrence would be the following:
dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1])
*/

// Time: O(n2)
// Space: O(n2)

class Solution {
    public boolean stoneGame(int[] piles) {
        
        //Create a nxn DP array to solve the recurrence
        int[][] dp  = new int[piles.length][piles.length];
        
        // Loop to fill up diagonals with stone vals from input array
        for (int i = 0; i < piles.length; i++) dp[i][i] = piles[i];
        
        // calculate dp[i][j] looping from temp = 1 to piles.length
        for (int temp = 1; temp < piles.length; temp++)
            for (int i = 0; i < piles.length - temp; i++)
            {
                int j = i+temp; //calculate j value.
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]); // Solve the recurrence
            }
        return dp[0][piles.length - 1] > 0; //If dp[0][len(piles)] > 0 return true, else false
    }
}
