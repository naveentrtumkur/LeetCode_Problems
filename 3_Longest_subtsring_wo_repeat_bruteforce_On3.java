// Bruteforce soln.
// This would be O(n^3)..
// Loop from i: 0 -> n
//     Loop from j: i+1 -> n
// isAllCharUnique(String, start_index, end_index) is a bool function which uses a 
// HashSet to find whether all the chars are unique or not...

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length() == 0)
            return 0;
        int len = s.length();
        int maxLen = 0;
        for(int i=0; i< len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                if(isAllCharUniq(s,i,j))
                    maxLen = Math.max(j-i, maxLen);
            }
        }
        
        return maxLen;
    }
    
    public boolean isAllCharUniq(String str, int i, int j )
    {
        //Define a HashSet and record all teh visited or seen characters.
        Set<Character> set = new HashSet<>(); //Defining a HashSet..
        
        for(; i<j;i++)
        {
            if(set.contains(str.charAt(i)))
                return false;
            else
                set.add(str.charAt(i));
        }
        
        return true;
    }
}
