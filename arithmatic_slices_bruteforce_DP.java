//Approach-2 using Dynamic programming.

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        //maintain the count of total such ArthmSequence possible.
        int[] res = new int[A.length];
        int sum = 0;
        
        
        //iterate every three elements and store the result in res array.
        for(int i=2;i<A.length;i++)
        {
            
           if(A[i] - A[i-1] == A[i-1] - A[i-2])
           {
               //count++;
               res[i] = 1+res[i-1];
           }
               
    }
        for(int i=0;i<res.length;i++)
            sum+=res[i];
        return sum;
    }
}
