//Standard Dp using a 2D array to store the sum.
//Return the minimum sum calculated from the approach.


class Solution {
    public int minPathSum(int[][] grid) {
        //Calculate the rows and columns.
        int row = grid.length;
        int col = grid[0].length;
        
        //Initialize a dp array to find the min path.
        int[][] dp = new int[row][col];
        
        //first value would remain the same.
        dp[0][0] = grid[0][0];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                //If we are traversing through rows, calculate current DP Value.
                if(j>0 && i==0)
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                else if(j == 0 && i>0) // If we are traversing along the col, calculate current dp value.
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                else if(i>0 && j>0)
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        
        //Return the final sum.
        return dp[row-1][col-1];
    }
}
