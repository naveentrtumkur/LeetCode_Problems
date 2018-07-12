// Efficient Solution Using Dynamic programming.
// O(mn) time complexity
// O(mn) space compelxity

class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0; //Find the row_len and the col_len.
        int[][] dp = new int[rows + 1][cols + 1]; //Intialize and declare the DP Array
        int maxsqlen = 0; //Init max sq length to 0.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1; // recurrence relation...
                    maxsqlen = Math.max(maxsqlen, dp[i][j]); // update the MaxSquare value.
                }
            }
        }
        return maxsqlen * maxsqlen; // return the max square so far.
    }
}


