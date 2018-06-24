// Java Solution by using HashSet to store the charcters.
// 1. If length of strings are unequal return false.
// 2. If the length is equal then find the index which are unequal.

class Solution {
    public boolean buddyStrings(String A, String B) {
        
         
        
        if(A.length()!=B.length())
            return false;
        
        if(A.equals(B))
        {
            Set<Character> set = new HashSet<>();
            for(int i=0;i<A.length();i++)
                set.add(A.charAt(i));
            
            // when repeated characters are present and set.length() is less than A.length()
            // Ex : aaa
            return set.size() < A.length();
            
        }
        //TO store the index
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=B.charAt(i))
                list.add(i);
        }
        
        return ((list.size() == 2) && (B.charAt(list.get(0)) == A.charAt(list.get(1)) ) && (A.charAt(list.get(0)) == B.charAt(list.get(1))));
    }
}



