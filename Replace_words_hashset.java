//Algorithm: Store all the roots in a key. for every node check whether there's a match to root. If yes, replace with root. Else ignore and retain teh word itself. 

//Time complexity: O(wi^2) where wi is each character in word 
//Space complexity: O(N) where N is number of words in sentence

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
        Set<String> set = new HashSet<>();
        
        StringBuilder sb = new StringBuilder(); //Declare a string builder to store the transformed string.
        
        for(String temp:dict)
        {
            set.add(temp);
        }
        
        for(String word:sentence.split("\\s+"))
        {
            String pref = "";
            
            for(int i=1;i<=word.length();i++)
            {
                pref = word.substring(0,i);
                if(set.contains(pref))
                    break; //Break out if root is contained in this word.
            }
            
            if(sb.length() > 0)
                sb.append(" "); //Add a space before adding the next word.
            sb.append(pref);
            
            
        }
        return sb.toString(); //Return the finally transformed string after computation.
        }
        
}
