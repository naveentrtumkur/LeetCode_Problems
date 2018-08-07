// Dp Soln with O(n) space and O(n) time.
// with efficient soln Space can be reduced to O(1)

// Time : O(n) Space : O(1)
class Solution {
    public int climbStairs(int n) {
        int[] prevCounts = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev0 = 0;
        int prev1 = 1; 
        int prev2 = 2;
        
        for (int i = 3; i <= n; i++) {
            
            int temp  = prev1 + prev2;
            prev0 = prev1;
            prev1 = prev2;
            prev2 = temp;
        }
        return prev2;
    }
}
