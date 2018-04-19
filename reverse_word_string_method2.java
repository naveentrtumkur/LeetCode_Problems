// Method 2 by using two StringBuilder objects and reversing according to required condition.

public class Solution {
    public String reverseWords(String s) {
       StringBuilder res = new StringBuilder();
       StringBuilder word = new StringBuilder();
        for(String r:s.split(" "))
        {
            word = new StringBuilder(r);
            //System.out.println(word);
            res.append(word.reverse()+" ");
        }
        //System.out.println("Ret string is:"+res.toString());
        return res.toString().trim();
    }
}
