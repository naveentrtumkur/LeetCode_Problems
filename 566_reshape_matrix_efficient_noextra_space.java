// Instead of using extra space, we can use two auxillary variables like row and col to point to result matrix
// and start updating simulataneousy as you traverse

// O(m*n) time and O(1) space complexity,.....

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[][] result = new int[r][c]; //Declare the result matrix and use that.
        
        //check the base case and return the original matrix if the condition isn't staisfied.
        if(nums.length == 0 || (r*c != (nums.length * nums[0].length))) //if the count of elements mistmatch, return false value
            return nums;
        
        //Use a Queue to store the elements.
        //Queue<Integer> queue = new LinkedList<>();
        
        //Traverse through the original elements and push them onto the queue.
        /*for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                queue.add(nums[i][j]); //Add the element onto the queue.
            }
        }*/
        
        // Performing teh reshape() of MatLab...
        //Now reconstruct the output array
        int row = 0, col = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                result[row][col] = nums[i][j]; //remove the element from the queue and add it onto the result matrix.
                col++;
                if(col == c)
                {
                    row++; //increment the row.
                    //reset the column
                    col = 0;
                }
            }
        }
        
        return result; //return the result.
    }
}
