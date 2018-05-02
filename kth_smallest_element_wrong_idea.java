class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(count == k)
                    return matrix[i][j];
            count++;
            }
        }
        
        //No matching element found, return -1
        return  -1;
    }
}
