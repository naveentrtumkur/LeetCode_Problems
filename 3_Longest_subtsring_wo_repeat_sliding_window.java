// Using Sliding Window Concept. USe two variables i = starting index
// and j = ending index. Slide the window to check is maxLen Substring exists
// We will be using HashSet as the sliding window.

// Time complexity: O(n)
// Space complexity: O(min(m,n)) n = string length m = size of char set. basically O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //we will be using a HashSet as the sliding window for the problem....
        Set<Character> set = new HashSet<>();
        
        int n = s.length();
        int maxLen = 0, i=0,j=0; //Initialize all the required values at the beginning.
        for(;i<n && j<n;) //we can simply use a while(i<n && j< n also for this 
        {
            if(!set.contains(s.charAt(j)))
            {
                 set.add(s.charAt(j));
                 j++;
                maxLen = Math.max(j-i, maxLen); //assign maxLen as the max of j-i and maxLen value.
                
            }
            else
            {
            set.remove(s.charAt(i)); //remove the ith character & increment i value.
            i++;
            }
        }
        
        //return the appropriate maxLen value.
        return maxLen;
        
    }
}
