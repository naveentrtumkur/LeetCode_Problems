// Find the length of longest palindromic subsequence.
// Dynamic Porgramming solution. Bottom-up approach

// Recurrence: dp[i][j] represents LPS where i= left index and j=right index.
// Dp[i][j] = { dp[i+1][j-1] + 2 if charAt(i) == charAt(j)
//            { Max(dp[i+1][j], dp[i][j-1]

// take care to init diagonals to 1.

//Space : O(2*n) ~O(n)  Time:O(n2)

class Solution {
    public int longestPalindromeSubseq(String s) {
        
    }
}
