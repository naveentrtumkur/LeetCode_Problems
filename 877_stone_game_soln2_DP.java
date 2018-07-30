// We need to come up with a DP approach.
/*
In our context dp[i][j] would be the max difference stones a person can pick to maximize winning chance.
A person can pick piles[i] or piles[j].

If he picks piles[i], result will be piles[i] - dp[i + 1][j] //second person picking this i+1 to j
If he pick piles[j], result will be piles[j] - dp[i][j - 1] //second person picking from i to j-1

The recurrence would be the following:
dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1])
*/


class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
