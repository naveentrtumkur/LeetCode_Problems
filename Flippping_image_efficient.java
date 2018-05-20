//My solution involves the following steps:-
// 1. Invert the digit at ith place
// 2. Swap digit at column_length - ith. place
// Return the resulting array.

// O(n2) time complexity and O(1) space complexity
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int col_len = A[0].length;
        for(int[] rows:A)
        {
            for(int i=0;i< (col_len+1)/2 ;i++)
            {
                int temp = rows[i] ^ 1;
                rows[i] = rows[col_len - 1 -i] ^1;
                rows[col_len - i -1] = temp;
            }
        }
        return A;
    }
}
