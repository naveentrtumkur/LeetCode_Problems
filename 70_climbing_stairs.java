// Dp Soln with O(n) space and O(n) time.
// with efficient soln Space can be reduced to O(1)

class Solution {
    public int climbStairs(int n) {
        int[] prevCounts = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        prevCounts[0] = 0;
        prevCounts[1] = 1; 
        prevCounts[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            prevCounts[i] = prevCounts[i-1] + prevCounts[i-2];
        }
        return prevCounts[n];
    }
}
