// O(n) solution divide numbers into groups and solve them to count the binary possible.

class Solution {
    public int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) != s.charAt(i-1))
                groups[++t] = 1; //Reinitailize the counter and increment t-count.
            else
                groups[t]++;
        }
        
        int ans = 0;// Count the number of binary possible
        for(int i=1;i<=t;i++)
        {
            ans+=Math.min(groups[i-1],groups[i]); //Find the min-count of groups[i] and groups[i-1] and return the answer. 
        }
        
        //return the ans
        return ans;
    }
}
