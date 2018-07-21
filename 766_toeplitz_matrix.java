/***

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

Now given an M x N matrix, return True if and only if the matrix is Toeplitz.

Ex: 

matrix = [
  [1,2,3,4],
  [5,1,2,3],
  [9,5,1,2]
]

***/

//O(m*n) time and O(m*n) space complexity...

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //Create a HashMap to store r-c and it's corresponding value.
        // If there's a mismatch return false, else we need to return true.
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int row=0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[0].length; col++)
            {
                if(!map.containsKey(row - col)) //If the entry doesn't exists add that entry onto the map.
                    map.put(row-col, matrix[row][col]);
                else if(map.containsKey(row - col)) //If the map contains that particular key, check if toepliitz condition is satisfied. else return false.
                {
                    if(map.get(row-col) != matrix[row][col])
                        return false;
                }
            }
        }
        return true;
    }
}
