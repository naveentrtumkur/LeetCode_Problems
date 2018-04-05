//Initial attempt to solve skylane java soln.

// I have come up with my logic to solve this problem.
// Left side view and right side views are same.
// Top and bottom side views are same.

/**Logic to solve my problem:
 * 1) Check current cell's row and column, if the cell is the highest no change required.
 * 2) If the cell isn't the highest, then check the second highest across row and column and assign that to cell.
 * through this way, you will not be altering the skyline.
 */


// Consider given problem and approach with a solution.
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        //Iterate through the entire grid.
        int maxTotal = 0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               int max = grid[i][j];
                int max2=0;
                int k = j;
                while(max<grid[i][k++] && k<grid[0].length)
                {
                    max2 = max;
                    max = grid[i][k];
                    
                }
                int l = i;
               // int max3;
                while(max < grid[l][j] && l<grid.length)
                {
                    max2 = max;
                    max = grid[l][j];
                }
                System.out.println(max2 - grid[i][j]);
                maxTotal += max2 - grid[i][j];
                grid[i][j] = max2;
            }
        }
        
        //return the maxTotal value.
        return maxTotal;
    }
}
