// Bruteforce solution to solve this probelm.
// Start from top leftmost and keep expanding diagonally.
// If you find zero, discard the square and proceed

// Time: O((mn)2)

//Space : O(1)

class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0; //find the row_length and the Col_length
        int maxsqlen = 0; //Initialize the squareLen to zero
        // Traverse the entire matrix to find a '1'..
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int sqlen = 1;
                    boolean flag = true; //set a flag to say that we have a 1
                    while (sqlen + i < rows && sqlen + j < cols && flag) {
                        for (int k = j; k <= sqlen + j; k++) {
                            if (matrix[i + sqlen][k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        for (int k = i; k <= sqlen + i; k++) {
                            if (matrix[k][j + sqlen] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag)
                            sqlen++;
                    }
                    if (maxsqlen < sqlen) {
                        maxsqlen = sqlen; //update the squarelength
                    }
                }
            }
        }
        return maxsqlen * maxsqlen; //Return the size of the max_squareLength
    }
}


