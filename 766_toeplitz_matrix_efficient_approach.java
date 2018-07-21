// My unique thought comparing diagonal elements from start to right-end.
// Just check mat[r][c] and compare with every mat[r-1][c-1].
// If all are equal return true, else return false..

// time would be O(m*n) and space would be constant i.e O(1)..


class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //Iterate every element and check its diagonal are same.
        // if not then return false.
        
        for(int i=0;i<matrix.length; i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i>0 && j>0 && matrix[i][j]!=matrix[i-1][j-1]) //If the previous diog elements and current are unequal
                    return false;
            }
        }
        
        return true;
    }
}
