/*

More optimisation by storing max of first row/first column and using first row & first column
to store teh max elements.

*/


// Working solution to the problem.

// I have come up with my logic to solve this problem.
// Left side view and right side views are same.
// Top and bottom side views are same.

/**Logic to solve my problem:
 * 1) Check current cell's row and column, if the cell is the highest no change required.
 * 2) If the cell isn't the highest, then check the second highest across row and column and assign that to cell.
 * through this way, you will not be altering the skyline.
 */

import java.util.*;
// Consider given problem and approach with a solution.
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int max = 0;
        
        //Use two arrays to store row and column max values.
        int[] mrow = new int[grid.length];
        int[] mcol = new int[grid[0].length];
        
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
                
            {
                mrow[i] = Math.max(grid[i][j], mrow[i]);
                mcol[j] = Math.max(grid[i][j], mcol[j]);
                
            }
        
        }
        
        // Iterate throiugh alll the elements and find Max across column and row i.e MATH.MIN(rowmax,colmax);
        for(int i=0; i<grid.length;i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                //Max values contain summation of differnce between increased value and orig value.
                max+= Math.min(mrow[i], mcol[j]) - grid[i][j];
            }
        }
        
        //return teh max changeable value.
        return max;
        
    }
}
