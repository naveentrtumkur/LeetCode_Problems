// You can tell it's constant space and O(n2) worst case complexity.
// k = 5
// a4,b4,c4.......y4,z5 as in "aaaabbbbcccc.........yyyyzzzzz"

// answer: 5 ("zzzzz")

class Solution {
    public int longestSubstring(String s, int k) {
    char[] str = s.toCharArray(); //Convert the input string to charArray...
    return helper(str,0,s.length(),k); //Call the helper D & C function...
}
    
// Divide & Conquer helper function...    
 int helper(char[] str, int start, int end,  int k){ //string, start, end and K digits count
    if (end - start < k) return 0;//substring length shorter than k.
    int[] count = new int [26]; //temp array to store char count
     
    //Setting and calculating the frequency of occuranvce of characterss
     for (int i = start; i<end; i++) {
        int index = str[i] - 'a'; //get the value from 0 to 25, for a to z.
        count[index]++;
    }
     
    for (int i=0; i<26; i++) {
        if (count[i] < k && count[i] > 0) { //count[i]=0 => i+'a' does not exist in the string, skip it.
            for (int j = start; j<end; j++) {
                if (str[j] == i+'a') {
                    int left = helper(str, start, j, k); //divide till j and recurse
                    int right = helper(str, j+1, end, k); //divide from j+1 till end and recurse.
                    return Math.max(left, right); // return the max value formed.
                }
            }
        }
    }
    return end - start; // return the end - start
}
}
