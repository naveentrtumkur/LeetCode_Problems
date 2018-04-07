//Second approach by observing the pattern.
// Kind of DP solution, we store the previous result.

class Solution {
    public int[] countBits(int num) {
        
        int[] res = new int[num+1];
        //if(num==0)
         //   return res;
        int curBit=1;
        for(int i=1; i<=num; i++)
        {
            // CAse1: Check whether i value is twice of curBit
            if(i == curBit*2)
            {
                res[i] = 1;
                curBit = i;
                
            }
            //Else add teh corresponding 1 bits fro CurBit to i.
            else
            {
                res[i] = 1 + res[i-curBit];
            }
           
        }
        return res;
    }
}
