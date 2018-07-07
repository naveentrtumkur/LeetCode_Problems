//Accepted solution...

// My logic is to split the string by spaces and store it in a List of Strings.
// Retrieve the length of the last string.

class Solution {
    public int lengthOfLastWord(String s) {
        //List<String> list = new ArrrayList<>();
        //if(s == null)
         //   return 0;
        String[] str = s.split("\\s+");
        if(str.length == 0)
            return 0; //This is the base case.
        System.out.println(str[str.length-1].length()); //Printing the length of the string.
        return str[str.length-1].length();
        
        
    }
}
