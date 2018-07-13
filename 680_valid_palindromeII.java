class Solution {
    public boolean validPalindrome(String s) {
        //My solution is to remove one character everytime and check whether it is palindrome,
        // -if yes return true.
        // - if not then return false.
        if(s == null || s.length() ==0)
            return true;
        
        for(int i=0; i< s.length();i++)
        {
            if(isPalindrome(s))
                return true;
            
            StringBuilder temp = new StringBuilder(s);
            temp.remove(i);
            if(isPalindrome(temp.toString()))
               return true;
        }
               
               //At the end of String and no palindrome by removing 1 character, so return false;
               return false;
    }
    
    public boolean isPalindrome(String temp)
    {
        StringBuilder rev = new StringBuilder(temp);
        if(temp.equals(rev.reverse()))
            return true;
        else
            return false;
    }
               
}
