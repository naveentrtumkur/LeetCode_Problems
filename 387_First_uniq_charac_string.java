class Solution {
    public int firstUniqChar(String s) {
        char[] charArr = s.toCharArray();//"leetcode"
        int[] letters = new int[26];
        
      
        //
        for(int i=0; i<charArr.length; i++){
           // [0,1,..,1, 2,..,0]
            ++letters[charArr[i]-'a'];
        }
        for(int i=0; i<charArr.length; i++){
            if(letters[charArr[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
