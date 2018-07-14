//Dp Solution O(min(m,n)) complexity.
// At any point dp[i][j] = dp[i-1][j] //comes from the up + dp[i][j-1] //comes from the left.
// Take care of teh base cases and boundary and you should be good to go
// Efficient Solution...

class Solution {
       public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0)
            return 0;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[j] += res[j - 1];
            }
        }
        return res[n - 1];

    }
}

 
