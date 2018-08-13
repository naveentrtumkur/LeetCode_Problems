// My Solution... Traverse the string from the end.
// If you encounter a '#' just remove the character.
// If you encounter some other character just move on.
// Time: O(n) and space: O(1)

/*****
Second approach : Easily thinkable
Use a stack to construct refined string.
If it's a non-# character push it onto the string.
Else pop the character from the string.

***/
        class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1; //Pointers to end of both the strings
        int hash_S = 0, hash_T = 0;

        while (i >= 0 || j >= 0) { // chec k if chars exist in string.
            while (i >= 0) { // if  S isn't null fidn the nextChar
                if (S.charAt(i) == '#')
                {
                    hash_S++;
                    i--;
                }
                else if (hash_S > 0)  //remove the next character because hash was seen before.
                {
                    hash_S--;
                    i--;
                }
                else break; //just a normal character seen
            }
            
            
            while (j >= 0) { //Find next char in T string
                if (T.charAt(j) == '#') 
                {
                    hash_T++; 
                    j--;
                }
                else if (hash_T > 0) 
                {
                    hash_T--; 
                    j--;
                }
                else break; //normal char was seen
            }
            
            // If ther's char and the two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            
            // If we will face count isn't same you can return
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}
