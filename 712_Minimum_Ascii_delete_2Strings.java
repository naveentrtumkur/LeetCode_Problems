// Given two strings find the minimum ascii delete so that the two strings become equal.

// Thoughts Dp Approach: Find the LCS(s1, s2) and delete the remaining characters.
// Implementation is below.
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1]; // declare a 2D Dp array to store Ascii values of chars of  i=of s1 and s2.
        
        // Construct Sum of Ascii upto Char_i
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i-1][0] + s1.charAt(i-1); 
        }
        
        // Sum of Ascii upto Char_i
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j-1] + s2.charAt(j-1);
        }
        
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]; //If the charcters are same retain and proceed
                } else {
                    dp[i][j] = Math.min(s1.charAt(i-1) + dp[i-1][j], s2.charAt(j-1) + dp[i][j-1]); //If the characters are different just choose minimum ascii character to retain and proceed.
                }
            }
        }
        return dp[s1.length()][s2.length()]; //return the finak result.
    }
}

// Pseudo code or algorithm to solve this.
// lcs(s1, m, s2, n)
// if s1(m) == s2(n) res = lcs(s1, m-1, s2, n-1);
// else lcs = Math.min(s1(m) + lcs(s1, m-1, s2, n), s2(n) + lcs(s1, m, s2, n-1))
