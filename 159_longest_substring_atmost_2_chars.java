/***
  Approach: Sliding window approach where we maintain a window with atmost 2 distinct charcacters in the window. When more than 2 distinct charcters are there we slide the window to right by one character.
  We will use HashMap to implement this solution.
  
  // We store a chracter and it's rightmost occurence in a HashMap.
  Always make sure hashmap has only two entries. (This can be easily scaled to k elements)
  - When the chars >2 find the leftmost character and remove that from HashMap.
  - Maintain teh maxLength of substring stisfying only two distinct charcters present.
  
  Time : O(n) SPace : O(n) Can be efficiently made to O(1) (limited characters)
  **/


class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int low = 0, high = 0;
        int maxLen = 0;
        
        while(high < s.length())
        {
            if(map.size() <= 2) //if the map size is less than = 2 then addition allowed
            {
                char c = s.charAt(high);
                map.put(c,high);
                high++; //increment high
            }
            if(map.size() > 2) //easily scalable to any "k" value
            {
                int leftMost = s.length();
                for(int idx: map.values())
                {
                    leftMost = Math.min(idx,leftMost);
                }
                
                char ch = s.charAt(leftMost);
                map.remove(ch); //Remove that character from map.
                low = leftMost + 1;
            }
            
            // Now calculate the maximum length of substring possible.
            maxLen = Math.max(maxLen, high - low);
        }
        
        //return the max len of substring.
        return maxLen;
    }
}
