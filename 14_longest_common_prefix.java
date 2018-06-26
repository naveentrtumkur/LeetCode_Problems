// Solution: 1. Store the firts string as the prefix.
// 2. Scan from second string onwards to find max matching characters.
// 3. at any point if there is no match delete charcter from prefix.
// 4. keep on proceeding for all the strings in the array. 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        
        String pref = strs[0]; //Assign the first string as prefix, hoping we might get matches from 2nd string onwards.
        
        for(int i = 1; i < strs.length; i++)
        {
            if(pref.length() == 0)
                return "";
            while(pref.length() !=0)
            {
                if((strs[i].indexOf(pref)) == 0 )
                {
                    break;
                }
                
                else
                {
                    pref = pref.substring(0,pref.length()-1);
                }
                
            } 
        }
        
        return pref;
    }
}
