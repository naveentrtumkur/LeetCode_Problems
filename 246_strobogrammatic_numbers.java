/***
 Thinking process.. We need to consider entire string of numbers as a whole.
 Initially create a HashMap of strobo numbers.
 6 --> 9
 8 --> 8
 9 --> 6
 0 --> 0
 1 --> 1

 every first index and last index combined should form a strobo number.
 If there is a mismatch anytime, just return false.
 At the end return true...
 ***/


class Solution {
    public boolean isStrobogrammatic(String num) {
        
        //Construct a Map of Strobo pairs.
        Map<Character, Character> map = new HashMap<>();
        map.put('1','1');
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('8','8');
        
        int i = 0, j = num.length() - 1;
        while(i<=j )
        {
            if(!map.containsKey(num.charAt(i)))
                return false;
            if(map.get(num.charAt(i)) != num.charAt(j))
               return false;
               
               i++;
               j--;
        }
               
               return true; // Completely found a strobic number.... SO return true.
    }
}
