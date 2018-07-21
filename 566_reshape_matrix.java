/*

Problem Statement:
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

*/

// Use additional space like queue or stack to store the elements of the original array.
// Then reconstruct the required array based on the inputs specified.

// O(m*n) time and O(m*n) space complexity,.....

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[][] result = new int[r][c]; //Declare the result matrix and use that.
        
        //check the base case and return the original matrix if the condition isn't staisfied.
        if(nums.length == 0 || (r*c != (nums.length * nums[0].length))) //if the count of elements mistmatch, return false value
            return nums;
        
        //Use a Queue to store the elements.
        Queue<Integer> queue = new LinkedList<>();
        
        //Traverse through the original elements and push them onto the queue.
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                queue.add(nums[i][j]); //Add the element onto the queue.
            }
        }
        
        // Performing teh reshape() of MatLab...
        //Now reconstruct the output array based on the elements pushed onto the queue.
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result[i][j] = queue.remove(); //remove the element from the queue and add it onto the result matrix.
                
            }
        }
        
        return result; //return the result.
    }
}
