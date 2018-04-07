//Second approach by observing the pattern.
// Kind of DP solution, we store the previous result.

class Solution {
    public int[] countBits(int num) {
        
        int[] res = new int[num+1];
        
        for(int i=0; i<=num; i++)
        {
           // observe the pattern of solving this problem.
            res[i] = i%2 + res[i/2];
        }
        return res;
    }
}
