// DP Solution is also possible.
// sort the Array based on first position.

// If max length is k and for any next pair of elements i=[][] and j=[][]
// check if i[*][x] < j[y][*]. if that's true increment the chain else move forward by assigning previous chain,

//Time: O(n2) space: O(n)

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (x, y) -> x[0] - y[0]); //sort the array by first co-ordinate
        int N = pairs.length; //find the length of pairs
        
        int[] dp = new int[N];
        Arrays.fill(dp, 1); //min length would be only that element. SO fill with 1 for every place.

        for (int j = 1; j < N; ++j) {
            for (int i = 0; i < j; ++i) {
                if (pairs[i][1] < pairs[j][0])
                    dp[j] = Math.max(dp[j], dp[i] + 1); //Cqlculate the maximum chain length upto that point j.
                // It would be either 1 itself or addition of previous chains found.
            }
        }

        //Find the maximum length and return that value.
        int ans = 0;
        for (int i=0;i<dp.length;i++) 
            if (dp[i] > ans) 
                ans = dp[i];
        return ans;
    }
}
