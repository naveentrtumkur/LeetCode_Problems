class Solution {
    public boolean hasAlternatingBits(int n) { 
        String str = Integer.toBinaryString(n);
        for(int i=0; i < str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
                return false;
        }
        
        //completed parsing the string, return true.
        return true;
    }
}
