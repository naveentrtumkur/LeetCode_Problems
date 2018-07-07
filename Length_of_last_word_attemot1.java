/*****

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5


***/


// My logic is to split the string by spaces and store it in a List of Strings.
// Retrieve the length of the last string.

class Solution {
    public int lengthOfLastWord(String s) {
        //List<String> list = new ArrrayList<>();
        
        String[] str = s.split(" ");
        System.out.println(str[str.length-1].length()); //Printing the length of the string.
        return str[str.length-1].length();
        
    }
}
