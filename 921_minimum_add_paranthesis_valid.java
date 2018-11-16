// My approach: Maintain a Stack & keep pushing the elements onto stack.
// If paranthesis match, remove such entry from stack.
// return the count of paranthesis at the end.

class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        if(S.length()==0) //The string is empty
            return 0;
        st.push(S.charAt(0));
        for(int i=1; i < S.length();i++)
        {
            if(S.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(')
            {
                st.pop();
                continue;
            }
            else
                st.push(S.charAt(i));
        }
        
        return st.size();
        
        //return 0;
    }
}
