/**

868. Transpose Matrix My SubmissionsBack to Contest
User Accepted: 149
User Tried: 205
Total Accepted: 150
Total Submissions: 211
Difficulty: Easy
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

 

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

***/

class Solution {
    public int[][] transpose(int[][] A) {
        
        if(A == null)
            return null;
        int rlen = A.length;
        int clen = A[0].length;
        int[][] result = new int[clen][rlen]; //Create a new array to store the result...
        
        for(int i=0;i< rlen;i++)
        {
            for(int j=0;j<clen;j++)
            {
                result[j][i] = A[i][j];
            }
        }
        
       /* //Print out the result and check that
        for(int i =0; i< clen; i++)
        {
            for(int j=0;j<rlen;j++)
            {
                System.out.print(" "+result[i][j]);
            }
            
            System.out.println();
        }*/
        return result;
    }
}
