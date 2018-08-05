// O(n2) solution where we keep on expanding around center by finding the center

// Time: O(n2) Space : O(1)
class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        int count = 0;// count of number of substrings.
        
        for(int center = 0; center <= len*2 - 1; center++ ) //loop from 0 to 2N-1
        {
            int left = center/2;
            int right = (center%2) + left;
            while(left>=0 && right < len && (s.charAt(left) == s.charAt(right)))
            {
                left--;
                right++;
                count++;
            }
            
        }
        
        //return the count of substrings.
        return count;
    }
}
