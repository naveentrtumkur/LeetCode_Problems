// Instead of using extra space, it would be sufficient to use just prev and current value.
// This would give raise to O(1) space solution with the usual O(n) time solution.

class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0, cur = 1;
        
        int ans =0;
        
        for(int i=1; i<s.length(); i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                ans += Math.min(prev,cur);
                prev = cur; //update the prev value.
                cur = 1; //update the curr value.
            }
            else
              cur++;  //Increment the cur value.
        }
        //for last iteration you wouldn't have updated the ans, so do that now.
        return ans + Math.min(prev,cur);
    }
}
