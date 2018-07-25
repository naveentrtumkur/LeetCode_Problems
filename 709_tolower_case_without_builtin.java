// O(n) solution without using the built-in toLowerCase() method.
// Just take diff between 'A' and 'a' and use that to convert every capital letter 
// to a small case letter.

class Solution {
    public String toLowerCase(String str) {
        int diff = 'A' - 'a';
        
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray())
        {
            if(ch>='A' && ch<='Z') //If teh range is between 'A' and 'Z'
                sb.append((char)(ch-diff));
            else
                sb.append(ch);
        }
        
        //return the final string as the result.
        return sb.toString();
    }
}
