// To find the first non-repeating character in a given String.
// Solution: O(n) 2 pass solution.
// Use a HashMap to store the character and frequency of each charcter.
// Once u reach EOS, start from first character. Return the character which has count of only 1.
// Space : O(n)

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        //Check the base case.
        if(s==null || s.length() == 0)
            return -1;
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
            else
                map.put(s.charAt(i),1);
            
        }

            for(int i=0;i<s.length();i++)
            {
                if(map.get(s.charAt(i)) == 1)
                    return i;
            }
        
        //We didnt find any non-repeating character.
        return -1;
    }
}
